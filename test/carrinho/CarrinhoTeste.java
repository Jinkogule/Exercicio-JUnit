/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrinho;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;
import produto.Produto;
import produto.ProdutoNaoEncontradoException;

/**
 *
 * @author Pimenta e PH
 */
public class CarrinhoTeste {
    @Test
    public void testaAddItem(){
        Produto esfregao = new Produto("Esfregão", 19.99);
        
        Carrinho carrinho = new Carrinho();
        carrinho.addItem(esfregao);
        
        assertEquals(1, carrinho.getQtdeItems());
    }
    
    @Test
    public void testaEsvazia(){
        Produto desodorante = new Produto("Desodorante", 15.99);
        Carrinho carrinho = new Carrinho();
        
        carrinho.addItem(desodorante);
        carrinho.esvazia();
        
        assertEquals(0, carrinho.getQtdeItems());
    }
    
    
    @Test
    public void testaProdutoNaoEncontradoException() throws ProdutoNaoEncontradoException{
        Carrinho carrinho = new Carrinho();
        Produto fandangos = new Produto("Fandangos", 4.99);
        
        try {
            carrinho.removeItem(fandangos);
            fail();
        } 
        catch (ProdutoNaoEncontradoException ex){
        }
    }
    
    @Test
    public void testaValorTotal(){
        Produto desodorante = new Produto("Desodorante", 15.99);
        Produto fandangos = new Produto("Fandangos", 4.99);
        Produto esfregao = new Produto("Esfregão", 19.99);
        
        double somaValor = desodorante.getPreco() + fandangos.getPreco() + esfregao.getPreco();
        
        Carrinho carrinho = new Carrinho();
        carrinho.addItem(desodorante);
        carrinho.addItem(fandangos);
        carrinho.addItem(esfregao);
        
        assertEquals(carrinho.getValorTotal(), somaValor);
        assertEquals(40.97, somaValor);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Pimenta e PH
 */
public class CalculadoraTeste {
    
    @Test
    public void testaSoma(){
        Calculadora calculadora = new Calculadora();
        calculadora.soma(5, 8);
        
        assertEquals(13, calculadora.soma(5, 8));
    }
    
    @Test
    public void testaMultiplicacao(){
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicacao(5, 6);
        
        assertEquals(30, calculadora.multiplicacao(5, 6));
    }
    
    @Test
    public void testaEhPositivo(){
        Calculadora calculadora = new Calculadora();
        
        int num = calculadora.subtracao(100, 99);
        
        assertTrue(num > 0);
    }
    
    @Test
    public void testaDivisao(){
        Calculadora calculadora = new Calculadora();
        
        int num = calculadora.subtracao(100, 99);
        
        assertTrue(num > 0);
    }
    
    @Test
    public void testaComparaSeEhIgual(){
        Calculadora calculadora = new Calculadora();
        
        int a = 10;
        int b = 10;
        
        int valorSupostamenteIgual = calculadora.compara(a, b);
        
        assertEquals(0, valorSupostamenteIgual);
    }
}

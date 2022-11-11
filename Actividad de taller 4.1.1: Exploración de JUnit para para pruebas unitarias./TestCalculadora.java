package pruebasunitarias;

import junit.framework.*;

public class TestCalculadora extends TestCase {

    private Calculadora calculadora;
    
    public void escenario(){

        calculadora = new Calculadora();

    }

    public void testSumar(){

        escenario();
        assertTrue(calculadora.sumar(2, 2) == (2+2));
    }
    public void testRestar(){

        escenario();
        assertTrue(calculadora.restar(5, 2) == (3));
    }

    public void testMultiplicar(){

        escenario();
        assertEquals(10,calculadora.multiplicar(5, 2));

    }
    public void testDividir(){

        escenario();
        assertEquals(5,calculadora.dividir(10, 2));

    }
    
}

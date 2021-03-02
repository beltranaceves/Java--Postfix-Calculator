/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Beltrán
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    /**
     * Test of evaluar method, of class Calculadora.
     */
    @Test
    public void testEvaluar() {
        System.out.println("evaluar");
        Expresion expr = new Suma(new Resta(new Constante(8), new Constante(2)), new Division(new Multiplicacion(new Constante(4), new Constante(2)), new RaizCuadrada(new CambioDeSigno(new Constante(-9)))));
        Calculadora instance = new Calculadora();
        double expResult = 8.666666666666666;
        double result = instance.evaluar(expr);
        assertEquals(expResult, result, 0.2);
    }

    @Test
    public void testEvaluar2() {
        System.out.println("evaluar");
        Expresion expr = null;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.evaluar(expr);
        assertEquals(result, expResult, 0.1);
    }
    /**
     * Test of PostOrden method, of class Calculadora.
     */
    @Test
    public void testPostOrden() {
        System.out.println("PostOrden");
        Expresion expr = new Suma(new Resta(new Constante(8), new Constante(2)), new Division(new Multiplicacion(new Constante(4), new Constante(2)), new RaizCuadrada(new CambioDeSigno(new Constante(-9)))));
        Calculadora instance = new Calculadora();
        String expResult = "8.0 2.0 - 4.0 2.0 * -9.0 -9.0 +/- -9.0 -9.0 +/- SQRT / + ";
        String result = instance.PostOrden(expr);
        assertEquals(expResult, result);
    }
}

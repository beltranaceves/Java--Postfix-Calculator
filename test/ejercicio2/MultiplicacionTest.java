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
public class MultiplicacionTest {
    
    public MultiplicacionTest() {
    }
    
    /**
     * Test of operar method, of class Multiplicacion.
     */
    @Test
    public void testOperar() {
        System.out.println("operar");
        Multiplicacion instance = new Multiplicacion(new Constante(3), new Constante(4));
        double expResult = 12;
        double result = instance.operar();
        assertEquals(expResult, result, 0.1);
    }
}

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
public class RestaTest {
    
    public RestaTest() {
    }
    
    /**
     * Test of operar method, of class Resta.
     */
    @Test
    public void testOperar() {
        System.out.println("operar");
        Resta instance = new Resta(new Constante(5), new Constante(2));
        double expResult = 3;
        double result = instance.operar();
        assertEquals(expResult, result, 0.1);
    }
}

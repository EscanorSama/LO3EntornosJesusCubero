/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author CES
 */
public class OperacionesTest {
    private static Operaciones operaciones;
    
    public OperacionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        operaciones = new Operaciones();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumarPar method, of class Operaciones.
     */
    
    @Test
    public void testSumarParPar() {
        int a = 2;
        int b = 2;
        int expResult = a+b;
        int result = operaciones.sumarPar(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testSumarParImpar() {
        int a = 2;
        int b = 3;
        int expResult = a+b+1;
        int result = operaciones.sumarPar(a, b);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of mayor method, of class Operaciones.
     */
    @Ignore
    @Test
    public void testMayorMenor() {
        int a = 3;
        int b = 2;
        int expResult = 3;
        int result = operaciones.mayor(a, b);
        assertEquals(expResult, result);
        
    }
    @Ignore
    @Test
    public void testMenorMayor() {
        int a = 2;
        int b = 3;
        int expResult = 3;
        int result = operaciones.mayor(a, b);
        assertEquals(expResult, result);
        
    }
    @Ignore
    @Test
    public void testIgual() {
        int a = 2;
        int b = 2;
        int expResult = 2;
        int result = operaciones.mayor(a, b);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sumarVector method, of class Operaciones.
     */
    @Ignore
    @Test
    public void testSumarVector() {
        System.out.println("sumarVector");
        int[] numeros = null;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.sumarVector(numeros);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

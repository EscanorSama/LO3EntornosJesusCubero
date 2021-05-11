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
    @Ignore
    @Test
    public void testSumarParPar() {
        int a = 2;
        int b = 2;
        int expResult = a+b;
        int result = operaciones.sumarPar(a, b);
        assertEquals(expResult, result);
        
    }
    @Ignore
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
        int expResult = a;
        int result = operaciones.mayor(a, b);
        assertEquals(expResult, result);
        
    }
    @Ignore
    @Test
    public void testMenorMayor() {
        int a = 2;
        int b = 3;
        int expResult = b;
        int result = operaciones.mayor(a, b);
        assertEquals(expResult, result);
        
    }
    @Ignore
    @Test
    public void testIgual() {
        int a = 2;
        int b = 2;
        int expResult = b;
        int result = operaciones.mayor(a, b);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sumarVector method, of class Operaciones.
     */
    
    @Test
    public void testSumarVector() {
        int[] numeros = {2,3,4,5};
        int expResult = 14;
        int result = operaciones.sumarVector(numeros);
        assertEquals(expResult, result);
        
    }
    
}

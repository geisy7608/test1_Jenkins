/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author geisy
 */
public class CalculatriceIT {
    
    public CalculatriceIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    
    @Test
    public void testClaculer() {
        System.out.println("claculer");
        int a = 5;
        int b = 7;
        Calculatrice instance = new Calculatrice();
        int expResult = 10;
        int result = instance.claculer(a, b);
        assertEquals(expResult, result);
        
    }
    
}

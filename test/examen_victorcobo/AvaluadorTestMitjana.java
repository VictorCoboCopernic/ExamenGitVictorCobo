/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_victorcobo;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Joe Kerekere
 */

@RunWith (Parameterized.class)
public class AvaluadorTestMitjana {
    
    private Avaluador instance;
    
   @Rule 
   public Timeout timeout = Timeout.millis(150);
   
   
    @Parameterized.Parameter(0)
    public Estudiant estudiant0;
    @Parameterized.Parameter(1)
    public double mitjana;
    
    
        @Parameterized.Parameters
    public static Collection<Object[]> data() {
        
        
        Object[][] estudiants = new Object[][] {
                {new Estudiant("Paco", 6.0, 5.0, 7.0), 6.0},
                {new Estudiant("Laura", 8.0, 9.0, 10.0), 9.0},
                {new Estudiant("Luis", 8.0, 9.0, 9.0), 8.66},
                {new Estudiant("Marc", 8.0, 6.0, 8.0), 7.33},
                {new Estudiant("Nuria", 6.0, 5.0, 7.0), 6.0},
                {new Estudiant("Antonio", 8.0, 9.0, 10.0), 9.0},
                {new Estudiant("Gerard", 8.0, 9.0, 9.0), 8.66},
                {new Estudiant("Oriol", 8.0, 6.0, 8.0), 7.33},
                {new Estudiant("Eric", 6.0, 5.0, 7.0), 6.0},
                {new Estudiant("Marta", 8.0, 9.0, 10.0), 9.0},
                {new Estudiant("Jesus", 8.0, 9.0, 9.0), 8.66},
                {new Estudiant("Marco", 8.0, 6.0, 8.0), 7.33},
                {new Estudiant("David", 6.0, 5.0, 7.0), 6.0},
                {new Estudiant("Daniel", 8.0, 9.0, 10.0), 9.0},
                {new Estudiant("Victor", 2.0, 2.0, 2.0), 2.0},
                    
            };
        
        return Arrays.asList(estudiants);
    }
    
    
    public AvaluadorTestMitjana() {
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

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     * @throws java.lang.Exception
     */
    @Test
    public void testMitjana() throws Exception {
        instance = new Avaluador();
        assertEquals(mitjana, instance.mitjana(estudiant0),0.01);
    
}
}

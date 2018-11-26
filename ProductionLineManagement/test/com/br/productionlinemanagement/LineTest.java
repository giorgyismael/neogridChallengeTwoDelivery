/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.productionlinemanagement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author giorgy
 */
public class LineTest {

    private Line line;
    
    public LineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.line = new Line("testLineName", 30);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Line.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Line instance = new Line("testLineName", 30);
        String expResult = this.line.getName();
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class Line.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "tesNameTwo";
        Line instance = new Line();
        instance.setName(name);
        
        String expResult = name;
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getTime method, of class Line.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Line instance = new Line("testeName", 30);
        int expResult = 30;
        int result = instance.getTime();
        assertEquals(expResult, result);

    }

    /**
     * Test of setTime method, of class Line.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        int time = 30;
        Line instance = new Line();
        instance.setTime(time);
        
        int expResult = time;
        int result = instance.getTime();
        assertEquals(expResult, result);

    }
    /**
     * Test of toString method, of class Line.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
        String expResult = "Line{name= testLineName, time= 30}";
        String result = this.line.toString();
        assertEquals(expResult, result);

    }
    
}

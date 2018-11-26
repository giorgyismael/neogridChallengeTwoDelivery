/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.productionlinemanagement;

import java.util.List;
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
public class LineListTest {

    private LineList lineList;
    
    public LineListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Line line00 = new Line("Line00", 30);
        Line line01 = new Line("Line00", 45);
        Line line02 = new Line("Line00", 60);
        Line line03 = new Line("Line00", 05);

        
        this.lineList = new LineList();
        this.lineList.addLine(line00);
        this.lineList.addLine(line01);
        this.lineList.addLine(line02);
        this.lineList.addLine(line03);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addLine method, of class LineList.
     */
    @Test
    public void testAddLine_String_int() {
        System.out.println("addLine");
        String name = "";
        int time = 0;
        LineList instance = new LineList();
        instance.addLine(name, time);
        assertEquals(instance.getSize(), 1);
  
    }

    /**
     * Test of addLine method, of class LineList.
     */
    @Test
    public void testAddLine_Line() {
        System.out.println("addLine");
        Line track = null;
        LineList instance = new LineList();
        instance.addLine(track);
        assertEquals(instance.getSize(), 1);
    }

    /**
     * Test of removeLine method, of class LineList.
     */
    @Test
    public void testRemoveLine() {
        System.out.println("removeLine");
        Line track = null;
        LineList instance = new LineList();
        instance.removeLine(track);
        assertEquals(instance.getSize(), 0);
    }

    /**
     * Test of getLineForTime method, of class LineList.
     */
    @Test
    public void testGetLineForTime() {
        System.out.println("getTrackForTime");
        int time = 30;
        LineList instance = new LineList();
        int expResult = 30;
        int result =  this.lineList.getLineForTime(time).getTime();
        assertEquals(expResult, result);

    }
    
}

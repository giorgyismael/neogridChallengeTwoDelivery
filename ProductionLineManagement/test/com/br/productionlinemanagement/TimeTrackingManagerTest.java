/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.productionlinemanagement;

import com.br.productionlinemanagement.TimeTrackingManager;
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
public class TimeTrackingManagerTest {
    TimeTrackingManager calendar;
    
    public TimeTrackingManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.calendar = new TimeTrackingManager();
    }
    
    @After
    public void tearDown() {
    }


//    @Test
//    public void testGetTime() {
//        System.out.println("getTime");
//        TimeTrackingManager instance = new TimeTrackingManager();
//        Date expResult = this.calendar.getTime();
//        Date result = instance.getTime();
//        assertEquals(expResult, result);
//    }


 
    @Test
    public void testCheckHourOfControlTime00() {
        System.out.println("checkHourOfControlTime");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(12);
        instance.setMinute(00);

        String expResult = "Morning Line";
        String result = instance.checkHourOfManagerTime();
        assertEquals(expResult, result);

    }

    @Test
    public void testCheckHourOfControlTime01() {
        System.out.println("checkHourOfControlTime");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(12);
        instance.setMinute(01);

        String expResult = "Almoço";
        String result = instance.checkHourOfManagerTime();
        assertEquals(expResult, result);

    }
  
    @Test
    public void testCheckHourOfControlTime02() {
        System.out.println("checkHourOfControlTime");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(12);
        instance.setMinute(59);

        String expResult = "Almoço";
        String result = instance.checkHourOfManagerTime();
        assertEquals(expResult, result);

    }
 
    @Test
    public void testCheckHourOfControlTime3() {
        System.out.println("checkHourOfControlTime");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(13);
        instance.setMinute(00);

        String expResult = "Afternoon Line";
        String result = instance.checkHourOfManagerTime();
        assertEquals(expResult, result);

    }
    
    @Test
    public void testCheckHourOfControlTime4() {
        System.out.println("checkHourOfControlTime");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(15);
        instance.setMinute(59);

        String expResult = "Afternoon Line";
        String result = instance.checkHourOfManagerTime();
        assertEquals(expResult, result);

    }
    
    @Test
    public void testCheckHourOfControlTime5() {
        System.out.println("checkHourOfControlTime");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(16);
        instance.setMinute(00);

        String expResult = "Afternoon Line";
        String result = instance.checkHourOfManagerTime();
        assertEquals(expResult, result);

    }
    
    @Test
    public void testCheckHourOfControlTime6() {
        System.out.println("checkHourOfControlTime");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(16);
        instance.setMinute(01);

        String expResult = "Afternoon Line";
        String result = instance.checkHourOfManagerTime();
        assertEquals(expResult, result);

    }
 
    @Test
    public void testCheckHourOfControlTime7() {
        System.out.println("checkHourOfControlTime");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(16);
        instance.setMinute(59);

        String expResult = "Afternoon Line";
        String result = instance.checkHourOfManagerTime();
        assertEquals(expResult, result);

    }
 
    @Test
    public void testCheckHourOfControlTime8() {
        System.out.println("checkHourOfControlTime");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(17);
        instance.setMinute(01);

        String expResult = "Labor Gymnastics";
        String result = instance.checkHourOfManagerTime();
        assertEquals(expResult, result);

    }
    @Test
    public void testCheckHourOfControlTime9() {
        System.out.println("checkHourOfControlTime");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(17);
        instance.setMinute(00);

        String expResult = "Labor Gymnastics";
        String result = instance.checkHourOfManagerTime();
        assertEquals(expResult, result);

    }
   
    @Test
    public void testCheckHourOfControlTime10() {
        System.out.println("checkHourOfControlTime");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(9);
        instance.setMinute(30);

        String expResult = "Morning Line";
        String result = instance.checkHourOfManagerTime();
        assertEquals(expResult, result);

    }
  
    @Test
    public void checkTrackTimeOfNext00() {
        System.out.println("checkTrackTimeOfNext");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(9);
        instance.setMinute(30);
        instance.setSecond(00);
        String check = instance.checkHourOfManagerTime();
        System.out.println(instance.getTime());
        int result = instance.checkTrackTimeOfNext(check);
        int expResult = 150;
        assertEquals(expResult, result);


    }
    @Test
    public void checkTrackTimeOfNext01() {
        System.out.println("checkTrackTimeOfNext");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(12);
        instance.setMinute(30);
        instance.setSecond(00);
        String check = instance.checkHourOfManagerTime();
        System.out.println(instance.getTime());
        int result = instance.checkTrackTimeOfNext(check);
        int expResult = 0;
        assertEquals(expResult, result);

    }

    @Test
    public void checkTrackTimeOfNext02() {
        System.out.println("checkTrackTimeOfNext");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(11);
        instance.setMinute(30);
        instance.setSecond(00);
        String check = instance.checkHourOfManagerTime();
        System.out.println(instance.getTime());
        int result = instance.checkTrackTimeOfNext(check);
        int expResult = 30;
        assertEquals(expResult, result);

    }
    @Test
    public void checkTrackTimeOfNext03() {
        System.out.println("checkTrackTimeOfNext");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(13);
        instance.setMinute(00);
        instance.setSecond(00);
        String check = instance.checkHourOfManagerTime();
        System.out.println(instance.getTime());
        int result = instance.checkTrackTimeOfNext(check);
        int expResult = 239;
        assertEquals(expResult, result);

    }
    @Test
    public void checkTrackTimeOfNext04() {
        System.out.println("checkTrackTimeOfNext");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(16);
        instance.setMinute(30);
        instance.setSecond(00);
        String check = instance.checkHourOfManagerTime();
        System.out.println(instance.getTime());
        int result = instance.checkTrackTimeOfNext(check);
        int expResult = 29;
        assertEquals(expResult, result);

    }
    @Test   
    public void checkTrackTimeOfNext05() {
        System.out.println("checkTrackTimeOfNext");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(16);
        instance.setMinute(59);
        instance.setSecond(00);
        String check = instance.checkHourOfManagerTime();
        System.out.println(instance.getTime());
        int result = instance.checkTrackTimeOfNext(check);
        int expResult = -2;
        assertEquals(expResult, result);

    }
    @Test
    public void checkTrackTimeOfNext06() {
        System.out.println("checkTrackTimeOfNext");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(11);
        instance.setMinute(59);
        instance.setSecond(00);
        String check = instance.checkHourOfManagerTime();
        System.out.println(instance.getTime());
        int result = instance.checkTrackTimeOfNext(check);
        int expResult = 01;
        assertEquals(expResult, result);

    }
    
    @Test
    public void checkTrackTimeOfNext07() {
        System.out.println("checkTrackTimeOfNext");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(13);
        instance.setMinute(01);
        instance.setSecond(00);
        String check = instance.checkHourOfManagerTime();
        System.out.println(instance.getTime());
        int result = instance.checkTrackTimeOfNext(check);
        int expResult = 238;
        assertEquals(expResult, result);

    }
    
    @Test
    public void checkTrackTimeOfNext08() {
        System.out.println("checkTrackTimeOfNext");
        TimeTrackingManager instance = new TimeTrackingManager();
        instance.setHour(17);
        instance.setMinute(00);
        instance.setSecond(00);
        String check = instance.checkHourOfManagerTime();
        System.out.println(instance.getTime());
        int result = instance.checkTrackTimeOfNext(check);
        int expResult = -2;
        assertEquals(expResult, result);

    }
    
//    
//    @Test
//    public void testSumMinControlTime() {
//        System.out.println("sumMinControlTime");
//        int min = 60;
//        TimeTrackingManager instance = new TimeTrackingManager();
//        Date expResult = instance.sumMinManagerTime(min);
//        Date result = this.calendar.sumMinManagerTime(min);
//        assertEquals(expResult, result);
//
//    }
//    
}

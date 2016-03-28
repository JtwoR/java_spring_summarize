/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wt.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author NIIT
 */
public class CalInfoTest {
    
    public CalInfoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("--------BeforeClass----------");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("---------AfterClass---------");
    }
    
    @Before
    public void setUp() {
        System.out.println("----------Before----------");
    }
    
    @After
    public void tearDown() {
        System.out.println("---------After---------");
    }
    
    @Test
    public void testAdd1() {
        System.out.println("add2");
        CalInfo calInfo = new CalInfo();
        
        int reslut = calInfo.add(1, 2);
        
        assertEquals(3, reslut);
    }
    
    @Ignore("--------")
    @Test
    public void testAdd2() {
        System.out.println("add2");
        CalInfo calInfo = new CalInfo();
        
        int reslut = calInfo.add(1, 1);
        
        assertEquals(2, reslut);
    }

}

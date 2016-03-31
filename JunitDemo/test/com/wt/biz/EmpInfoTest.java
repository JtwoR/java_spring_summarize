package com.wt.biz;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmpInfoTest {
    
    public EmpInfoTest() {
    }
    
   @BeforeClass
    public static void beforeClass() {
        System.out.println("---------beforeClass-----------");
    }
    
    @AfterClass
    public static void afterClass() {
        System.out.println("---------afterClass-----------");
    }
    
    @Before
    public void before() {
        System.out.println("----------before----------");
    }
    
    @After
    public void after() {
        System.out.println("---------after-----------");
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

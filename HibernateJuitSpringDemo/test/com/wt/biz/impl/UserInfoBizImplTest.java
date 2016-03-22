/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wt.biz.impl;

import com.wt.dao.UserInfoDao;
import com.wt.entity.UserInfo;
import javax.annotation.Resource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import test.InitJUnitTest;

/**
 *
 * @author NIIT
 */
public class UserInfoBizImplTest extends InitJUnitTest{
    @Resource(name="userInfoBizImpl")
    private UserInfoBizImpl userInfoBizImpl;
    
    public UserInfoBizImplTest() {
    }
    
    @Test
    public void testDoSave() {
        UserInfo userInfo = new UserInfo();
        
        userInfo.setUserName("wt");
        userInfo.setUserSex("boy");
        
        boolean bool = userInfoBizImpl.doSave(userInfo);
        
        assertTrue(bool);
    }
    
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of doSave method, of class UserInfoBizImpl.
//     */
//    @Test
//    public void testDoSave() {
//        System.out.println("doSave");
//        UserInfo userInfo = null;
//        UserInfoBizImpl instance = new UserInfoBizImpl();
//        boolean expResult = false;
//        boolean result = instance.doSave(userInfo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setUserInfoDao method, of class UserInfoBizImpl.
//     */
//    @Test
//    public void testSetUserInfoDao() {
//        System.out.println("setUserInfoDao");
//        UserInfoDao userInfoDao = null;
//        UserInfoBizImpl instance = new UserInfoBizImpl();
//        instance.setUserInfoDao(userInfoDao);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}

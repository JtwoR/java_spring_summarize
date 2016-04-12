package com.wt.test;

import com.wt.biz.impl.UserInfoBizImpl;
import com.wt.dao.UserInfoDao;
import com.wt.entity.UserInfo;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.Mockito;

public class UserInfoBizImplJUnitTest {
    
    private UserInfoBizImpl userInfoBizImpl;
    private UserInfoDao userInfoDao;
    
    public UserInfoBizImplJUnitTest() {
    }
    
    @Before
    public void before(){
    
        userInfoBizImpl = new UserInfoBizImpl();
        
        // 模拟
        userInfoDao = Mockito.mock(UserInfoDao.class);
        
        userInfoBizImpl.setUserInfoDao(userInfoDao);
        
    }
    
    @Test
    public void testFindById(){
        
        UserInfo userInfo1 = new UserInfo();
        userInfo1.setUserName("Hello");
        Mockito.when(userInfoDao.get(1)).thenReturn(userInfo1);
        
        UserInfo userInfo2 = userInfoBizImpl.findById(1);
        Mockito.verify(userInfoDao).get(1);
        Assert.assertEquals("Hello", userInfo2.getUserName());
        
    }

}

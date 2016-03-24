/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.biz.impl;

import com.wt.biz.UserInfoBiz;
import com.wt.entity.UserInfo;
import java.util.List;
import javax.annotation.Resource;
import org.junit.Test;
import static org.junit.Assert.*;
import test.InitJUnitTest;

/**
 *
 * @author NIIT
 */
public class UserInfoBizImplTest extends  InitJUnitTest{
   @Resource(name="userInfoBizImpl")
//  private UserInfoBizImpl userInfoBizImpl;
   
  private UserInfoBiz userInfoBizImpl;
    
    public UserInfoBizImplTest() {
    }

    @Test
    public void testDoSave() {
        UserInfo userinfo=new UserInfo();
        userinfo.setUserName("test");
        userinfo.setUserSex("testBoy");
        boolean bool=userInfoBizImpl.doSave(userinfo);
        assertTrue(bool);
        
    }
    
    
    // 以下为查找数据的测试    
    @Test
    public void testDoSelect() {
        List<UserInfo> list = null;
        
        list = userInfoBizImpl.doSelect(new UserInfo());
        
        for (UserInfo user : list) {
            System.out.println("----Id-----" + user.getUserId());
            System.out.println("----Name-----" + user.getUserName());
            System.out.println("----Sex-----" + user.getUserSex());
        }
    }
    
}

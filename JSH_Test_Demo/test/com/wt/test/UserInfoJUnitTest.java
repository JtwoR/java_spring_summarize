package com.wt.test;

import com.wt.biz.UserInfoBiz;
import com.wt.entity.UserInfo;
import java.util.List;
import javax.annotation.Resource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserInfoJUnitTest extends InitJUnitTest{
    
    @Resource(name = "userInfoBizImplSpringXml")
    private UserInfoBiz userInfoBiz;
    
    public UserInfoJUnitTest() {
    }
    
     @Test
    public void testDoSave(){
        UserInfo userInfo = new UserInfo();
        
        userInfo.setUserName("dd");
        userInfo.setUserPassword("testPassword");
        
        userInfoBiz.doSave(userInfo);
    }
    
    @Test
    public void testDoQuery(){
        String testName = "cc";
        
        userInfoBiz.doQuery(testName);
        
        List<UserInfo> userInfos = userInfoBiz.doQuery(testName);
        
        for (UserInfo userInfo : userInfos) {
            System.out.println("---------------------------------------");
            System.out.println("user_id --- " + userInfo.getUserId());
            System.out.println("user_name --- " + userInfo.getUserName());
            System.out.println("user_password --- " + userInfo.getUserPassword());
        }

    }
    
//    @Test
//    public void testDoDelete(){
//        String testName = "testName";
//        
//        UserInfo userInfo = userInfoBiz.doQuery(testName);
//        
//        userInfoBiz.doDelete(userInfo);
//        
//    }
}

package com.wt.util;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class EmailUtilTest {
    
    @Parameters
    public static Collection<Object[]> getParameters(){
        
        Object[][] paramers = {
            {"hhh@163.com", true}, {"adda@ad", false}, {"qbc@4a.cn", true}
        };
        
        return Arrays.asList(paramers);
    }
    
    private String email;
    private boolean flag;
    
    public EmailUtilTest(String email, boolean  flag) {
        this.email = email;
        this.flag = flag;
    }   
    
    @Test
    public void testCheckEmail() {
        System.out.println("checkEmail");
        
        EmailUtil emailUtil = new EmailUtil();
        boolean result = emailUtil.checkEmail(email);
        
        assertEquals(flag, result);
        
    }
    
}

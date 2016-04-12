package com.wt.testJsp;

import net.sourceforge.jwebunit.junit.JWebUnit;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class IndexJUnitTest {
    
    public IndexJUnitTest() {
    }
    
    @Before
    public void before(){
        
        // 使用委托
        JWebUnit.setBaseUrl("http://localhost:8080/mavenprojectMockObject/");
        
    }
    
    @Test
    public void testLoginError(){
        
        JWebUnit.beginAt("index.html");
        JWebUnit.clickLinkWithText("Login");
        JWebUnit.assertTitleEquals("login");
        JWebUnit.setTextField("username", "ho");
        JWebUnit.submit();
        JWebUnit.assertTitleEquals("error");
        
    }
    
    @Test
    public void testLoginSuccess(){
        
        JWebUnit.beginAt("index.html");
        JWebUnit.clickLinkWithText("Login");
        JWebUnit.assertTitleEquals("login");
        JWebUnit.setTextField("username", "hoho");
        JWebUnit.submit();
        JWebUnit.assertTitleEquals("success");
        
    }
    
}

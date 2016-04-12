package com.wt.test;

import net.sourceforge.jwebunit.junit.JWebUnit;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class JSTLJUnitTest {
    
    public JSTLJUnitTest() {
    }
    
    @Before
    public void before(){
        
        // 使用委托
        JWebUnit.setBaseUrl("http://localhost:8080/mavenprojectMockObject/");
        
    }
    
    @Test
    public void testLoginError(){
        
        JWebUnit.beginAt("showStudent.jsp");
        JWebUnit.submit();
        JWebUnit.assertTablePresent("Details");
        JWebUnit.assertTextInTable("Details", "student1_name");
        JWebUnit.assertTextInTable("Details", "student2_name");
        JWebUnit.assertTextInTable("Details", "student3_name");
        
    }
    
}

package com.wt.test;

import com.wt.entity.StuInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StuInfoTest {
    
    public static void main(String[] args){
        
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/beans.xml");
                
        context.getBean("stu");
        
        StuInfo stu = new StuInfo();
        
        String s = stu.print("TT");
    
        System.out.println(s);
    }
    
}

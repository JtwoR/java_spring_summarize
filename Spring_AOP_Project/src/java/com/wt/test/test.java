package com.wt.test;

import com.wt.one.OneTeach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/beans.xml");
        
        OneTeach oneTeach = (OneTeach) context.getBean("teacherProxy");
        
        oneTeach.baseLanguage();
    }
    
}

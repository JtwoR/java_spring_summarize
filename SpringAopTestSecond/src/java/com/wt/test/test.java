package com.wt.test;

import com.wt.computer.ICal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/beans.xml");
        
        ICal cal = (ICal) context.getBean("calImpl");
        
//        int x = cal.add(12, 5);
        int y = cal.div(15, 0);
        
//        System.out.println("add ----- " + x);
        System.out.println("div ----- " + y);
        
    }
    
}

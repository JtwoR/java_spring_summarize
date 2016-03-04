
package com.test;

import com.entity.HelloText;
import com.text.ActivityDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/beans.xml");
        HelloText helloText = (HelloText)context.getBean("hello");
        System.out.println("Sting:");
        System.out.println(helloText.getHelloWords());
        System.out.println("Date:");
        System.out.println(helloText.getDate());
        
        ActivityDemo activityDemo = (ActivityDemo) context.getBean("activityDemo");
        activityDemo.play();
        
    }
}

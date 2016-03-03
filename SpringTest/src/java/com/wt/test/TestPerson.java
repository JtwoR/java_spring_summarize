package com.wt.test;

import com.wt.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
    
    public static void main(String[] args) {
        
        // 使用Spring的形式生成对象,依赖注入
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/beans.xml");
        
        Person zhangge = (Person) context.getBean("zhangge");
        zhangge.showInfo();

        Person rod = (Person) context.getBean("rod");
        rod.showInfo();
    }
    
}

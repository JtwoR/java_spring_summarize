package com.wt.test;

import com.wt.entity.StuInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInfo {
    
    public static void main(String[] args) {
        // 先前的对象生成方式
//        StuInfo stu = new StuInfo();
//        
//        stu.setStu_Name("hohoTT");
//        stu.setAge(21);
//        stu.showInfo();
        
        // 使用Spring的形式生成对象,依赖注入
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/beans.xml");
        
        StuInfo TT = (StuInfo) context.getBean("TT");
        TT.showInfo();

        StuInfo xin = (StuInfo) context.getBean("xin");
        xin.showInfo();
    }
    
}

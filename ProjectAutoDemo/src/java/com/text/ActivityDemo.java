/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.text;

import com.impl.BoyImp;
import com.inter.BoySpeciality;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author NIIT
 */
public class ActivityDemo {
    private BoySpeciality boy;
    public void play(){
        boy = new BoyImp();
        boy.sport("乒乓");
        System.out.println("com.text.ActivityDemo.play()");
    }

    public void setBoy(BoySpeciality boy) {
        this.boy = boy;
    }
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/beans.xml");
    }
    
}

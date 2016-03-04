/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.impl;

import com.entity.Person;
import com.inter.BoySpeciality;

/**
 *
// * @author NIIT
 */
public class BoyImp extends Person implements BoySpeciality{
    
    private char sex;
    
    public BoyImp(){}
    
    public BoyImp(String name,int age,char sex){
       super(name, age);
       this.sex=sex;
       System.out.println("com.impl.BoyImp.<init>()"+super.getP_name());
    }
    @Override
    public void sport(String subject) {
        super.info(subject);
        System.out.println("---"+subject);
    }

    @Override
    public void feel() {
        System.out.println("今天去登山！"); 
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    
}

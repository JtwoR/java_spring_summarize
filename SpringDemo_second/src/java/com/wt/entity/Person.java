package com.wt.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Person {
    
    private String personName = "Nobody";
    private String personWords = "Noword";
    
    public void sayInfo(){
        System.out.println(personName + " say " + personWords + "!");
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonWords() {
        return personWords;
    }

    public void setPersonWords(String personWords) {
        this.personWords = personWords;
    }
    
    public static void main(String[] args){
        
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/beans.xml");
    
        Person per = (Person) context.getBean("per");
        
        per.sayInfo();
        
    }
}


package com.entity;

import java.util.Date;

public class HelloText {
    private String HelloWords;
    private Date date=new Date();
    public HelloText(){
        System.out.println(" 无参数的构造函数！");
    }
    public HelloText(Date date){
        this.date=date;
    }

    public String getHelloWords() {
        return HelloWords;
    }

    public void setHelloWords(String HelloWords) {
        this.HelloWords = HelloWords;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}

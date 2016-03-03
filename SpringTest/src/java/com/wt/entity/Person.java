package com.wt.entity;

public class Person {
    
    private String name;
    private String words;

    public void showInfo(){
        System.out.println(getName()+ " 说 : " +  getWords());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }
    
    
}


package com.entity;

public class Person {
   private String p_name;
   private int p_age;
   public Person(){
       System.out.println("com.entity.Person.<init>()");
   }
   public Person( String pName,int pAge){
       this.p_name=pName;
       this.p_age=pAge;
       System.out.println("com.entity.Person.<init>(...)"+
               this.p_name+"---"+this.p_age);
   }
   public String info(String pName){
       return "Hello"+pName;
   }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public int getP_age() {
        return p_age;
    }

    public void setP_age(int p_age) {
        this.p_age = p_age;
    }
   
   
   
   
}

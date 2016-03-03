package com.wt.entity;

public class StuInfo {
    
    private String stu_Name;
    private int Age;

    public StuInfo(String stu_Name, int Age) {
        this.stu_Name = stu_Name;
        this.Age = Age;
        System.out.println("com.wt.entity.StuInfo.<init>()");
    }
    
    public void showInfo(){
        System.out.println("------" + getStu_Name() + "------" + getAge());
    }
    
    public String getStu_Name() {
        return stu_Name;
    }

    public void setStu_Name(String stu_Name) {
        this.stu_Name = stu_Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
    
    
}

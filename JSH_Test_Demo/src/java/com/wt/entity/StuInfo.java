package com.wt.entity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

//@ApplicationScoped
//@Named("stuInfo")
public class StuInfo {
    
    private Integer stuId;
    private String stuName;
    private String stuEmail;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail;
    }
    
}

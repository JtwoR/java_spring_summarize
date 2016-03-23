package com.wt.entity;

import java.io.Serializable;
import java.sql.Blob;

public class StuInfo implements Serializable{
    
    private Integer s_id;
    
    private String s_name;
    
    private String s_sex;
    
    // 以下为Blob类型的数据，一般用于对图片的数据库存储，原理是把图片打成二进制
    // 然后进行的一种存储方式，在java中对应byte［］数组
    private Blob s_photo;

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public Blob getS_photo() {
        return s_photo;
    }

    public void setS_photo(Blob s_photo) {
        this.s_photo = s_photo;
    }
    
}

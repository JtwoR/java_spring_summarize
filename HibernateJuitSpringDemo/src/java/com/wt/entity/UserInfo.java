package com.wt.entity;

import java.io.Serializable;

/**
 *
 * @author NIIT
 */
public class UserInfo implements Serializable{
    private Integer userId;
    private String userName;
    private String userSex;
    //getter...setter.....

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
    
}

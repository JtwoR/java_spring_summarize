package com.wt.manager;

import com.wt.biz.UserInfoBiz;
import com.wt.entity.UserInfo;

public class UserManager {
    
    private UserInfo userInfo = new UserInfo();
    
    private UserInfoBiz userInfoBiz;
    
    // 创建登陆的方法
    public String reg(){

        boolean flag = this.userInfoBiz.doSave(userInfo);
        
        return flag?"success":"error";
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public UserInfoBiz getUserInfoBiz() {
        return userInfoBiz;
    }

    public void setUserInfoBiz(UserInfoBiz userInfoBiz) {
        this.userInfoBiz = userInfoBiz;
    }
    
}

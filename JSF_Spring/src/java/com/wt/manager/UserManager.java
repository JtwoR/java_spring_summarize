package com.wt.manager;

import com.wt.biz.UserInfoBiz;
import com.wt.entity.UserInfo;
import java.util.List;

public class UserManager {
    
    private UserInfoBiz userInfoBiz;
    private List<UserInfo> users;
    
    public String find(){
        users = this.userInfoBiz.findAll();
        if(users == null || users.size() == 0){
            return "error";
        }
        return "main";
    }

    public UserInfoBiz getUserInfoBiz() {
        return userInfoBiz;
    }

    public void setUserInfoBiz(UserInfoBiz userInfoBiz) {
        this.userInfoBiz = userInfoBiz;
    }

    public List<UserInfo> getUsers() {
        return users;
    }

    public void setUsers(List<UserInfo> users) {
        this.users = users;
    }
}

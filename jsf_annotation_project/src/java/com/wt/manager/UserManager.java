package com.wt.manager;

import com.wt.entity.UserInfo;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "user")
@SessionScoped
public class UserManager {
    // 对象的初始化
    private UserInfo userInfo = new UserInfo();
    private List<String> names = new ArrayList<String>();
    
    public String login(){
        // 模拟数据库
        for (int i = 0; i < 5; i++) {
            names.add("hhhooo " + i);
        }
        
        // 登陆方法
        // 筛选
        if("hohoTT".equals(userInfo.getUserName()) && "12321".equals(userInfo.getUserPassword())){
            return "main";
        }   
        
        return "error";
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
    
}

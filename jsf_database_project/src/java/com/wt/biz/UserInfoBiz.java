package com.wt.biz;

import com.wt.dao.impl.UserInfoDaoImpl;
import com.wt.entity.UserInfo;
import java.util.List;

public class UserInfoBiz {
    
    private UserInfoDaoImpl userInfoDaoImpl;

    public UserInfoBiz() {
        this.userInfoDaoImpl = new UserInfoDaoImpl();
    }
    
    public List<UserInfo> findAll(){
        List<UserInfo> data = null;
        
        try {
           data = this.userInfoDaoImpl.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return data;
    }
}

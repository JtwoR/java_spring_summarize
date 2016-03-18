package com.wt.biz;

import com.wt.dao.impl.UserInfoDaoImpl;
import com.wt.entity.UserInfo;
import java.util.List;

// 业务逻辑处理类
public class UserInfoBiz {
    
    // userInfoDaoImpl已经在applicationContext.xml中配置了，即初始化了
    private UserInfoDaoImpl userInfoDaoImpl;

    public void setUserInfoDaoImpl(UserInfoDaoImpl userInfoDaoImpl) {
        this.userInfoDaoImpl = userInfoDaoImpl;
    }
    
    public List<UserInfo> findAll(){
        List<UserInfo> list = null;
        
        try {
           list = this.userInfoDaoImpl.findAll();
        } catch (Exception e) {
            System.out.println("------ " + e.getMessage());
        }
        
        return list;
    }
}

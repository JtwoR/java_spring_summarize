package com.wt.dao.impl;

import com.wt.dao.UserInfoDao;
import com.wt.entity.UserInfo;
import java.util.ArrayList;
import java.util.List;

public class UserInfoDaoImpl implements UserInfoDao{

    @Override
    public List<UserInfo> findAll() {
        List<UserInfo> users = new ArrayList<UserInfo>();
        
        UserInfo user = null;
        for (int i = 0; i < 5; i++) {
            user = new UserInfo();
            user.setUserId(i + 1);
            user.setUserName("hoho " + i);
            users.add(user);
        }
        
        return users;
    }
    
}

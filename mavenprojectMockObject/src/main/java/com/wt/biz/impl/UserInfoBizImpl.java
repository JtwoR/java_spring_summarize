package com.wt.biz.impl;

import com.wt.biz.UserInfoBiz;
import com.wt.dao.UserInfoDao;
import com.wt.entity.UserInfo;

public class UserInfoBizImpl implements UserInfoBiz{

    private UserInfoDao userInfoDao;

    public UserInfoBizImpl() {
    }

    public UserInfoBizImpl(UserInfoDao userInfoDao) {
        this.userInfoDao = userInfoDao;
    }
    
    @Override
    public UserInfo findById(int id) {
        
        // 调用别人写的方法，此时这个人并没有写完这个方法
        UserInfo userInfo = this.userInfoDao.get(id);
        
        return userInfo;
    }

    public void setUserInfoDao(UserInfoDao userInfoDao) {
        this.userInfoDao = userInfoDao;
    }
    
}

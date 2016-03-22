package com.wt.biz.impl;

import com.wt.biz.UserInfoBiz;
import com.wt.dao.UserInfoDao;
import com.wt.entity.UserInfo;

public class UserInfoBizImpl implements UserInfoBiz{

    private UserInfoDao userInfoDao;
    
    @Override
    public boolean doSave(UserInfo userInfo) {
        boolean bool = false;
        
        try {
            this.userInfoDao.save(userInfo);
            bool = true;
        } catch (Exception e) {
        }
        
        return bool;
    }

    public void setUserInfoDao(UserInfoDao userInfoDao) {
        this.userInfoDao = userInfoDao;
    }
    
}

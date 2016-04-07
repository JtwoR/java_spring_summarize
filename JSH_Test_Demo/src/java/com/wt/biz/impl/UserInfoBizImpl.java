package com.wt.biz.impl;

import com.wt.biz.UserInfoBiz;
import com.wt.dao.UserInfoDao;
import com.wt.entity.UserInfo;
import java.util.List;

public class UserInfoBizImpl implements UserInfoBiz{
    
    private UserInfoDao userInfoDao;

    @Override
    public boolean doSave(UserInfo userInfo) {
        
        boolean bool = false;
        
        try {
            this.userInfoDao.save(userInfo);
            bool = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return bool;
        
    }

    @Override
    public List<UserInfo> doQuery(String userName) {
        boolean flag = false;
//        UserInfo userInfo = null;
        List userInfos = null;
        try {
            
            userInfos = this.userInfoDao.query(userName);
            
            flag = true;
        } catch (Exception e) {
        }
        
        return userInfos;
    }

    @Override
    public boolean doDelete(UserInfo userInfo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setUserInfoDao(UserInfoDao userInfoDao) {
        this.userInfoDao = userInfoDao;
    }
    
}

package com.wt.biz.impl;

import com.wt.dao.UserInfoDao;

import com.wt.entity.UserInfo;
import java.util.List;

/**
 *
 * @author NIIT
 */
public class UserInfoBizImpl implements com.wt.biz.UserInfoBiz {

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
    public List<UserInfo> doSelect(UserInfo userInfo) {
        List<UserInfo> list = userInfoDao.findAll();
        
        return list;
    }

    
    // 加 setter
    public void setUserInfoDao(UserInfoDao userInfoDao) {
        this.userInfoDao = userInfoDao;
    }
    
}

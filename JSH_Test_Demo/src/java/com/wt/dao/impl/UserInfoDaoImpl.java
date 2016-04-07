/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wt.dao.impl;

import com.wt.dao.UserInfoDao;
import com.wt.entity.UserInfo;
import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 *
 * @author NIIT
 */
public class UserInfoDaoImpl extends HibernateDaoSupport implements UserInfoDao{

    @Override
    public void save(UserInfo userInfo) {
        super.getHibernateTemplate().save(userInfo);
    }

    
    
    @Override
    public void delete(UserInfo userInfo) {
        
        super.getHibernateTemplate().delete(userInfo);
    }

    @Override
    public List<UserInfo> query(String userName) {
        
//        UserInfo userInfo = (UserInfo) super.getHibernateTemplate().find("from UserInfo where name = '" + userName + "'");
    
        List userInfos = super.getHibernateTemplate().find("from UserInfo where user_name = '" + userName + "'");
        
        return userInfos;
        
    }
    
}

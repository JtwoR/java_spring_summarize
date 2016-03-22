package com.wt.dao.impl;

import com.wt.dao.UserInfoDao;
import com.wt.entity.UserInfo;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class UserInfoDaoImpl extends HibernateDaoSupport implements UserInfoDao{

    @Override
    public void save(UserInfo userInfo) {
        super.getHibernateTemplate().save(userInfo);
    }
    
}

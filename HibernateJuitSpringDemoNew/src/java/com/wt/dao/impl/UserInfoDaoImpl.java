
package com.wt.dao.impl;

import com.wt.dao.UserInfoDao;
import com.wt.entity.UserInfo;
import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 *
 * @author NIIT
 */
public class UserInfoDaoImpl  extends HibernateDaoSupport implements UserInfoDao{

    @Override
    public void save(UserInfo userInfo) {
       super.getHibernateTemplate().save(userInfo);
    }

    @Override
    public List<UserInfo> findAll() {
        List list =  super.getHibernateTemplate().find("FROM UserInfo");
        
        return list;
    }   
    
}

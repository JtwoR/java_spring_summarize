package com.wt.dao.impl;

import com.wt.dao.StuInfoDao;
import com.wt.entity.StuInfo;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class StuInfoDaoImpl extends HibernateDaoSupport implements StuInfoDao{

    @Override
    public void query(String name) {
        
        StuInfo stuInfo =  (StuInfo) super.getHibernateTemplate().find("from StuInfo where name = '" + name + "'");
        
    }

    @Override
    public void save(StuInfo stuInfo) {
        
        super.getHibernateTemplate().save(stuInfo);
        
    }
    
}

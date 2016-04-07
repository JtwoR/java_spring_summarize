package com.wt.dao.impl;

import com.wt.dao.TeaInfoDao;
import com.wt.entity.TeaInfo;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class TeaInfoDaoImpl extends HibernateDaoSupport implements TeaInfoDao{

    @Override
    public void query(String name) {
        
        TeaInfo teaInfo =  (TeaInfo) super.getHibernateTemplate().find("from TeaInfo where name = '" + name + "'");
        
    }

    @Override
    public void save(TeaInfo teaInfo) {
        
        super.getHibernateTemplate().save(teaInfo);
        
    }

    
}

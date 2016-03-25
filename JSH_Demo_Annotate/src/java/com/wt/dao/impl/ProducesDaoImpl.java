package com.wt.dao.impl;

import com.wt.dao.ProducesDao;
import com.wt.entity.Produces;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class ProducesDaoImpl extends HibernateDaoSupport implements ProducesDao{

    @Override
    public void save(Produces produces) {
        super.getHibernateTemplate().save(produces);
    }
    
}

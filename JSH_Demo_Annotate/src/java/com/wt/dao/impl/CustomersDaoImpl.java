package com.wt.dao.impl;

import com.wt.dao.CustomersDao;
import com.wt.entity.Customers;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class CustomersDaoImpl extends HibernateDaoSupport implements CustomersDao{

    @Override
    public void save(Customers customers) {
        super.getHibernateTemplate().save(customers);
    }
    
}

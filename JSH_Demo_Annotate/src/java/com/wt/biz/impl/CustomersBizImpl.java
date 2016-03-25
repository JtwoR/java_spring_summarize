package com.wt.biz.impl;

import com.wt.biz.CustomersBiz;
import com.wt.dao.CustomersDao;
import com.wt.dao.ProducesDao;
import com.wt.entity.Customers;
import com.wt.entity.Produces;

public class CustomersBizImpl implements CustomersBiz{

    private CustomersDao customersDao;
    private ProducesDao producesDao;
    
    @Override
    public boolean doSave(Customers customers, Produces produces) {
        
        boolean bool = false;
        
        try {
            this.customersDao.save(customers);;
            this.producesDao.save(produces);
            
            bool = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
                
        return bool;
    }

    public void setCustomersDao(CustomersDao customersDao) {
        this.customersDao = customersDao;
    }

    public void setProducesDao(ProducesDao producesDao) {
        this.producesDao = producesDao;
    }
    
}

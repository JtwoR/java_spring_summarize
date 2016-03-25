package com.wt.biz.impl;

import com.wt.biz.ProducesBiz;
import com.wt.dao.ProducesDao;
import com.wt.entity.Produces;

public class ProducesBizImpl implements ProducesBiz{

    private ProducesDao producesDao;
    
    @Override
    public boolean doSave(Produces produces) {
        boolean bool = false;
        
        try {
            this.producesDao.save(produces);
            bool = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return bool;
    }

    public void setProducesDao(ProducesDao producesDao) {
        this.producesDao = producesDao;
    }
    
}

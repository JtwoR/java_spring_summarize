package com.wt.biz.impl;

import com.wt.biz.StuInfoBiz;
import com.wt.dao.StuInfoDao;
import com.wt.entity.StuInfo;

public class StuInfoBizImpl implements StuInfoBiz{
    
    private StuInfoDao stuInfoDao;

    @Override
    public boolean doQuery(String name) {
        
        boolean flag = false;
        
        try {
            
            this.stuInfoDao.query(name);
            
            flag = true;
        } catch (Exception e) {
        }
        
        return flag;
        
    }
    
    @Override
    public boolean doSave(StuInfo stuInfo) {
        boolean flag = false;
        
        try {
            
            this.stuInfoDao.save(stuInfo);
            
            flag = true;
        } catch (Exception e) {
        }
        
        return flag;
    }

    public void setStuInfoDao(StuInfoDao stuInfoDao) {
        this.stuInfoDao = stuInfoDao;
    }

    
}

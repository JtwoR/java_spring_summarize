package com.wt.biz.impl;

import com.wt.biz.TeaInfoBiz;
import com.wt.dao.TeaInfoDao;
import com.wt.entity.TeaInfo;

public class TeaInfoBizImpl implements TeaInfoBiz{
    
    private TeaInfoDao teaInfoDao;

    @Override
    public boolean doQuery(String name) {
        
        boolean flag = false;
        TeaInfo teaInfo = null;
        
        try {
            
            this.teaInfoDao.query(name);
            
            flag = true;
        } catch (Exception e) {
        }
        
        return flag;
        
    }

    @Override
    public boolean doSave(TeaInfo teaInfo) {
        
       boolean bool = false;
        
        try {
            this.teaInfoDao.save(teaInfo);
            bool = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return bool;
    }

    public void setTeaInfoDao(TeaInfoDao teaInfoDao) {
        this.teaInfoDao = teaInfoDao;
    }
}

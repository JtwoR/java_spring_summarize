package com.wt.dao;

import com.wt.entity.StuInfo;

public interface StuInfoDao {
    
    public void query(String name);
    
    public void save(StuInfo stuInfo);
    
}

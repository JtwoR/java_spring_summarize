package com.wt.dao;

import com.wt.entity.TeaInfo;

public interface TeaInfoDao {
    
    public void query(String name);
    
    public void save(TeaInfo teaInfo);
    
}

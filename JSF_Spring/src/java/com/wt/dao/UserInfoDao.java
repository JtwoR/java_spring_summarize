package com.wt.dao;

import com.wt.entity.UserInfo;
import java.util.List;

public interface UserInfoDao {
    
    public List<UserInfo> findAll();
    
}

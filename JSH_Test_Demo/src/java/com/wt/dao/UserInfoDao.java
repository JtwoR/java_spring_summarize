package com.wt.dao;

import com.wt.entity.UserInfo;
import java.util.List;

public interface UserInfoDao {
    
    public void save(UserInfo userInfo);
    
    public List<UserInfo> query(String userName);
    
    public void delete(UserInfo userInfo);
    
}

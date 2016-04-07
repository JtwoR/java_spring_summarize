package com.wt.biz;

import com.wt.entity.UserInfo;
import java.util.List;

public interface UserInfoBiz {
    
    public boolean doSave(UserInfo userInfo);
    
    public List<UserInfo> doQuery(String userName);
    
    public boolean doDelete(UserInfo userInfo);
    
}

package com.wt.biz;

import com.wt.entity.StuInfo;

public interface StuInfoBiz {
    
    public boolean doQuery(String name);
    
    public boolean doSave(StuInfo stuInfo);
    
}

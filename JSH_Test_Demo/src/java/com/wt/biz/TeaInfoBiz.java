package com.wt.biz;

import com.wt.entity.TeaInfo;

public interface TeaInfoBiz {
    
    public boolean doQuery(String name);
    
    public boolean doSave(TeaInfo teaInfo);
    
}

package com.wt.biz;

import com.wt.entity.Customers;
import com.wt.entity.Produces;

public interface CustomersBiz {
    
    // 同时在两张表中添加数据
    public boolean doSave(Customers customers, Produces produces);
    
}

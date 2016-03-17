package com.wt.impl;

// 接口的实现类

import com.wt.computer.ICal;

public class CalImpl implements ICal{

    @Override
    public int add(int i, int j) {
        System.out.println("com.wt.impl.CalImpl.add() 方法执行！！！");
        
        return (i + j);
    }

    @Override
    public int div(int i, int j) {
        System.out.println("com.wt.impl.CalImpl.div() 方法执行！！！");
        
        return (i / j);
    }
    
}

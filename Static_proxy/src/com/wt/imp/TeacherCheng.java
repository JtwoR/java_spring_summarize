package com.wt.imp;

import com.wt.ITeach;
import com.wt.one.OneTeach;

public class TeacherCheng implements ITeach{

//    private TeacherTT tt;
//    
      // 之前是传入具体的人
//    public TeacherCheng(TeacherTT tt){
//        this.tt = tt;
//    }
    
    private ITeach iTeach;
    
    // 使用接口的形式传入，而不是具体的对象
    // 静态代理为一对一的形式
    public TeacherCheng(ITeach iTeach){
        this.iTeach = iTeach;
    }
    
    @Override
    public void teaching() {
        System.out.println("今天TT有事情，由我Cheng上课！");
        
        iTeach.teaching();
    }
    
}

package com.wt.imp;

import com.wt.ITeach;

public class TeacherTT implements ITeach{

    @Override
    public void teaching() {
        System.out.println("开始点名，开始上课！");
    }
}

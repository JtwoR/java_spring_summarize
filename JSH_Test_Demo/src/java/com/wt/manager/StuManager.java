package com.wt.manager;

import com.wt.biz.StuInfoBiz;
import com.wt.entity.StuInfo;

public class StuManager {
    
    private StuInfo stuInfo = new StuInfo();
    
    private StuInfoBiz stuInfoBiz;
//    private String name;
    
    // 创建登陆的方法
    public String reg(){
//        boolean flag = this.stuInfoBiz.doSave(stuInfo);

        boolean flag = this.stuInfoBiz.doSave(stuInfo);
        
        return flag?"success":"error";
    }

    public StuInfo getStuInfo() {
        return stuInfo;
    }

    public void setStuInfo(StuInfo stuInfo) {
        this.stuInfo = stuInfo;
    }

    public StuInfoBiz getStuInfoBiz() {
        return stuInfoBiz;
    }

    public void setStuInfoBiz(StuInfoBiz stuInfoBiz) {
        this.stuInfoBiz = stuInfoBiz;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    
    
}

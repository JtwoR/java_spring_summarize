package com.wt.manager;

import com.wt.biz.TeaInfoBiz;
import com.wt.entity.TeaInfo;

public class TeaManager {
    
    private TeaInfo teaInfo = new TeaInfo();
    
    private TeaInfoBiz teaInfoBiz;
    
    private String reg(){
        
        boolean flag = this.teaInfoBiz.doSave(teaInfo);
        
        return flag?"success":"error";
        
    }
    
}

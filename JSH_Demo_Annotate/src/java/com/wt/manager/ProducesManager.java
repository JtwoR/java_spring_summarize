package com.wt.manager;

import com.wt.biz.ProducesBiz;
import com.wt.entity.Produces;


// 添加JSF收管Bean
public class ProducesManager {
    
    private Produces produces = new Produces();
    private ProducesBiz producesBiz;
    
    // 创建登陆的方法
    public String reg(){
        boolean flag = this.producesBiz.doSave(produces);
        
        return flag?"success":"error";
    }

    public Produces getProduces() {
        return produces;
    }

    public void setProduces(Produces produces) {
        this.produces = produces;
    }

    public ProducesBiz getProducesBiz() {
        return producesBiz;
    }

    public void setProducesBiz(ProducesBiz producesBiz) {
        this.producesBiz = producesBiz;
    }
    
}

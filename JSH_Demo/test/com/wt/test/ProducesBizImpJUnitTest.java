package com.wt.test;

import com.wt.biz.ProducesBiz;
import com.wt.entity.Produces;
import javax.annotation.Resource;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProducesBizImpJUnitTest extends SessionFactoryJUnitTest{
    
    @Resource(name = "producesBizImplSpringXml")
    private ProducesBiz producesBiz;
    
    public ProducesBizImpJUnitTest() {
    }
    
    @Test
    public void testSave(){
        Produces produces = new Produces();
        
        produces.setProName("test_pro");
        produces.setProPrice(123.321);
        
        producesBiz.doSave(produces);
    }
    
}

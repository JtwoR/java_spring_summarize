package com.wt.test;

import com.wt.biz.StuInfoBiz;
import com.wt.biz.TeaInfoBiz;
import com.wt.entity.TeaInfo;
import javax.annotation.Resource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TeaInfoJUnitTest extends InitJUnitTest{
    
    @Resource(name = "TeaInfoBizImplSpringXml")
    private TeaInfoBiz teaInfoBiz;
    
    public TeaInfoJUnitTest() {
    }
    
    @Test
    public void testSave(){
    
        TeaInfo teaInfo = new TeaInfo();
        
        teaInfo.setTeaName("testTeaName");
        teaInfo.setTeaPassword("testteaPassword");
        
        teaInfoBiz.doSave(teaInfo);
        
    }
    
    @Test
    public void testDoQuery(){
        String testName = "testOne";
        
        teaInfoBiz.doQuery(testName);
        
    }
    
}

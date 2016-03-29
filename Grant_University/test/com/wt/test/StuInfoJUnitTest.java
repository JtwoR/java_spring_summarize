package com.wt.test;

import com.wt.biz.StuInfoBiz;
import com.wt.entity.StuInfo;
import javax.annotation.Resource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StuInfoJUnitTest extends initJUnitTest{
    
    
    @Resource(name = "StuInfoBizImplSpringXml")
    private StuInfoBiz stuInfoBiz;
    
    public StuInfoJUnitTest() {
    }
    
    @Test
    public void testDoSave(){
        StuInfo stuInfo = new StuInfo();
        
        stuInfo.setStuName("testOne");
        stuInfo.setStuEmail("6060@qq.com");
        
        stuInfoBiz.doSave(stuInfo);
    }
    
    @Test
    public void testDoQuery(){
        String testName = "testOne";
        
        stuInfoBiz.doQuery(testName);
        
    }
}

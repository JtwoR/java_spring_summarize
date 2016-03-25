package com.wt.test;

import com.wt.biz.CustomersBiz;
import com.wt.entity.Customers;
import com.wt.entity.Produces;
import javax.annotation.Resource;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomersBizImpJUnitTest extends SessionFactoryJUnitTest{
    
    @Resource(name = "customersBizImplSpringXml")
    private CustomersBiz customersBiz;
    
    public CustomersBizImpJUnitTest() {
    }
    
    @Test
    public void testDoSave(){
        
        Produces produces = new Produces();
        produces.setProName("test_pro6666661122");
        produces.setProPrice(1111111.666666666);
        
        Customers customers = new Customers();
        customers.setCustomerName("test_cus666661122");
        customers.setCustomerPassword("2222222222222.666666");
        
        customersBiz.doSave(customers, produces);
        
    }
    
}

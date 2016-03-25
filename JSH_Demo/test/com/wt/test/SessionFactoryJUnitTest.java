package com.wt.test;

import javax.annotation.Resource;
import org.hibernate.SessionFactory;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:web\\WEB-INF\\applicationContext.xml"})
public class SessionFactoryJUnitTest {
    
    @Resource(name = "sessionFactorySpringXml")
    private SessionFactory sessionFactory;
    
    public SessionFactoryJUnitTest() {
    }
    
    @Test
    public void testConnection(){
        assertNotNull(sessionFactory);
    }
}

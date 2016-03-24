package test;

import javax.annotation.Resource;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author NIIT
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:web\\WEB-INF\\applicationContext.xml"})
public class InitJUnitTest {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;
    public InitJUnitTest() {
    }
    @Test
    public void testInit(){
        assertNotNull(sessionFactory);
    }
    
}

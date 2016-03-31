package com.wt.biz;

import java.util.List;
import java.util.regex.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserInfoTest {
    
    public UserInfoTest() {
    }
    
    @Test
    public void testFindByName() {
        System.out.println("-------findByName-------");
        
        UserInfo userInfo = new UserInfo();
        
        String name = "wt";
        List list = userInfo.findByName(name);
        
        assertThat(list.size(), Matchers.lessThan(5));
    }
    
}

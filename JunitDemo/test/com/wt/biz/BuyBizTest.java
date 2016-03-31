package com.wt.biz;

import java.util.Arrays;
import java.util.Collection;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

// 1. @Runwith
@RunWith(Parameterized.class)
public class BuyBizTest {
    // 参数化测试
    // 2. Parameters
    @Parameters
    public static Collection<Integer[]> getParameters(){
        Integer[][] parameters = {
            {200, 218}, {500, 558}, {100, 100}
        };
        
        return Arrays.asList(parameters);
    }
    
    // 3. 创建公共的构造方法，函数的数据要接受等效的数据
    public BuyBizTest(int parameter, int result) {
        this.parameter = parameter;
        this.expect = result;
    }
    
    // 4. 为每一列测试数据创建实例变量
    private int parameter;
    private int expect;
    
    // 5. 创建一个测试用例
    @Test
    public void testGetTotal200() {
        System.out.println("---------testGetTotal-----------");
        
        BuyBiz buyBiz = new BuyBiz();
        int result = buyBiz.getTotal(parameter);
        
        Assert.assertEquals(expect, result);
    }
    
    @BeforeClass
    public static void beforeClass() {
        System.out.println("---------beforeClass-----------");
    }
    
    @AfterClass
    public static void afterClass() {
        System.out.println("---------afterClass-----------");
    }
    
    @Before
    public void before() {
        System.out.println("----------before----------");
    }
    
    @After
    public void after() {
        System.out.println("---------after-----------");
    }
    
    
    
    
//    @Test
//    public void testGetTotal200() {
//        System.out.println("---------testGetTotal-----------");
//        System.out.println("充值200");
//        
//        BuyBiz buyBiz = new BuyBiz();
//        
//        int price = 200;
//        int result = buyBiz.getTotal(price);
//        
//        Assert.assertEquals(218, result, 0);
//    }
//    
//    @Test
//    public void testGetTotal500() {
//        System.out.println("---------testGetTotal-----------");
//        System.out.println("充值500");
//        
//        BuyBiz buyBiz = new BuyBiz();
//        
//        int price = 500;
//        int result = buyBiz.getTotal(price);
//        
//        Assert.assertEquals(558, result, 0);
//    }
//    
//    @Test
//    public void testGetTotal100() {
//        System.out.println("---------testGetTotal-----------");
//        System.out.println("充值100");
//        
//        BuyBiz buyBiz = new BuyBiz();
//        
//        int price = 100;
//        int result = buyBiz.getTotal(price);
//        
//        Assert.assertEquals(100, result, 0);
//    }
    
}

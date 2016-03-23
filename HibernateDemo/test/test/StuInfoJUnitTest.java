/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.wt.entity.StuInfo;
import java.io.FileInputStream;
import java.sql.Blob;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.service.ServiceRegistry;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class StuInfoJUnitTest {
    
    // 首先创建需要的
    SessionFactory sessionFactory = null;
    Session session = null;
    Transaction transaction = null;
    
    // 初始化配置操作
    @Before
    public void init() {
         // 创建 configuration 解析配置文件
        Configuration configuration = new Configuration().configure();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        
        // 创建 SessionFactory 解析配置文件
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        
        // 创建 session
        session = sessionFactory.openSession();
        // CRUD
        
        // 开启事务
        transaction = session.beginTransaction();
    }
    
    // 最后的销毁处理部分
    @After
    public void destroy() {
        // 提交事务
        transaction.commit();
        
        // 关闭 session 
        session.close();
        
        // 关闭sessionFactory
        sessionFactory.close();
    }
    
    // 以下为测试查询的方法
    @Test
    public void testQuery(){
        Criteria criteria = session.createCriteria(StuInfo.class);
        criteria.add(Example.create(new StuInfo()));
        List<StuInfo> list = criteria.list();
        
        for (StuInfo stuInfo : list) {
            System.out.println("------------------------------------");
            System.out.println("s_id----- " + stuInfo.getS_id());
            System.out.println("s_name---- " + stuInfo.getS_name());
            System.out.println("s_sex----- " + stuInfo.getS_sex());
        }
    } 
    
    // 以下为测试指定id的查询方法
    @Test
    public void testQueryById(){
        StuInfo stuInfo = (StuInfo) session.get(StuInfo.class, 1);
        
        System.out.println("------------ID为 ：" + stuInfo.getS_id() + " 的信息---------------");
        System.out.println("s_id----- " + stuInfo.getS_id());
        System.out.println("s_name---- " + stuInfo.getS_name());
        System.out.println("s_sex----- " + stuInfo.getS_sex());
        
        
    }
    
    // 以下为测试插入的方法
    @Test
    public void testInsert(){
        
        try {
            // 修改之前图片的绝对路径为相对路径
            FileInputStream in = new FileInputStream("web\\img\\testImg.jpg");
            Blob photo = Hibernate.getLobCreator(session).createBlob(in, in.available());
            StuInfo stuInfo = new StuInfo();

            stuInfo.setS_name("test");
            stuInfo.setS_sex("testGirl");
            
            stuInfo.setS_photo(photo);
            
            // 调用 session 中的save方法，保存创建的学生，执行插入操作
            session.save(stuInfo);
            
        } catch (Exception e) {
            System.out.println("想要获取的图片不存在");
        }
        
    }
    
    // 以下为更新操作
    @Test
    public void testUpdate(){
        StuInfo stuInfo = (StuInfo) session.get(StuInfo.class, 2);
        
        // 修改名字
        stuInfo.setS_name("6666666666666666");
        
        // 调用 session 中的save方法，保存修改的学生信息，执行修改操作
        session.save(stuInfo);
    }
    
    // 以下为测试删除操作的方法
    @Test
    public void testDelete(){
        // 选择第三个进行删除操作
        try {
            StuInfo stuInfo = (StuInfo) session.get(StuInfo.class, 3);
        
            session.delete(stuInfo);

            // 调用 session 中的save方法，执行删除操作
            session.save(stuInfo);
        } catch (Exception e) {
            System.out.println("要删除的stu不存在" + e);
        }
    }
    
}

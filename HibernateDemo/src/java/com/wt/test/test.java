package com.wt.test;

import com.wt.entity.StuInfo;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.service.ServiceRegistry;

public class test {
    
    public static void main(String[] args) {
        
        // 创建 configuration 解析配置文件
        Configuration configuration = new Configuration().configure();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        
        
        // 创建 SessionFactory 解析配置文件
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        
        // 创建 session
        Session session = sessionFactory.openSession();
        // CRUD
        
        // 开启事务
        Transaction transaction = session.beginTransaction();
        
        // save
//        StuInfo stu = new StuInfo();
//        stu.setS_name("test");
//        stu.setS_sex("boy");
//        
//        // 调用 session 中的方法
//        session.save(stu);
        
        // 提交事务
        transaction.commit();
        
        qdu(session);
        
        // 关闭 session 
        session.close();
    }

    private static void qdu(Session session) throws HibernateException {
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
    
}

package com.wt.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TeacherProxy implements InvocationHandler{
    
    // 创建一个被代理的对象
    private Object targerObject;
    
    // 创建一个被代理的对象
//    public Object instanceProxy(Object targerObject){
//        this.targerObject = targerObject;
//        
//        // 返回被代理的对象
//        // this 为代理者，即 TeacherProxy
//        return Proxy.newProxyInstance(targerObject.getClass().getClassLoader(), targerObject.getClass().getInterfaces(), this);
//    }
    // 以下使用泛型的形式,创建一个被代理的对象
    public <T> T instanceProxy(Object targerObject){
        this.targerObject = targerObject;
        
        // 返回被代理的对象
        // this 为代理者，即 TeacherProxy
        return (T)Proxy.newProxyInstance(targerObject.getClass().getClassLoader(), targerObject.getClass().getInterfaces(), this);
    }

    // proxy ---- 表示被调用的对象
    // method --- 表示执行的方法
    // args --- 表示被代理的方法的参数
    // object --- 表示方法的返回值
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我来代替你们的老师上课！");
        
        Object object = method.invoke(targerObject, args);
        System.out.println("今天的课程结束！");
        
        return object;
    }
    
    
}

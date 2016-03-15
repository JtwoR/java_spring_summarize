package com.wt.advice;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class TeacherAdvice implements MethodBeforeAdvice{

    // 事前通知
    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        
        System.out.println("方法前置通知执行！");
        System.out.println("类名：" + o.getClass().getSimpleName());
        System.out.println("方法名：" + method.getName());

        
    }
    
}

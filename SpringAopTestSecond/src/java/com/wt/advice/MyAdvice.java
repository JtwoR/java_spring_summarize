package com.wt.advice;

import java.util.Arrays;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

// 事前通知
public class MyAdvice {
    // 日志文件
    // 获取日记记录器
    private Logger log = Logger.getLogger(MyAdvice.class);
    
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        
        // 方法调用的时候显示方法名
        System.out.println("------- before()方法执行！ ------ 前置通知");
        System.out.println("------- 类名 ： " + joinPoint.getTarget().getClass().getSimpleName());
        System.out.println("方法名----- " + joinPoint.getSignature().getName());
        System.out.println("------- 方法参数： " + Arrays.toString(args));
        
    }

    public void after(JoinPoint joinPoint){
        // 方法调用的时候显示方法名
        System.out.println("------- after()方法执行！ ------后置通知");
    }
    
    public void afterReturning(JoinPoint joinPoint, Object result){
        // 方法调用的时候显示方法名
        System.out.println("------- afterReturning()方法执行！ ------返回值通知");
        System.out.println("返回值是 ： " + result);
    }
    
    public void afterThrowing(JoinPoint joinPoint, Exception exception){
        // 方法调用的时候显示方法名
        System.out.println("------- afterThrowing()方法执行！");
        System.out.println("异常信息是 -----  " + exception.getMessage());
        
        // 调用日志记录器
        log.debug("----error----", exception);
    }
    
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        Object object = null;
        
        // 方法调用的时候显示方法名
        System.out.println("------- arround()方法执行！ 环绕通知");
        try {
            object = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            System.out.println("------- arround()的方法异常信息是 -----  " + throwable.getMessage());
        }
        
        System.out.println("------- arround()方法执行结束");
        
        return object;
    }
}

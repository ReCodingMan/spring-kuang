package com.cc.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 方式三：使用注解方式实现aop
 */
@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.cc.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("=======方法执行前======");
    }

    @After("execution(* com.cc.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("=======方法执行后======");
    }

    /**
     * 在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
     */
    @Around("execution(* com.cc.service.UserServiceImpl.*(..))")
    public void arround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("=======环绕前======");

        //获得签名
        Signature signature = joinPoint.getSignature();
        System.out.println(signature);

        //执行方法
        Object proceed = joinPoint.proceed();
        System.out.println(proceed);

        System.out.println("=======环绕后======");
    }
}

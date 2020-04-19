package com.mystudy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AnnotationAspect {
    @Before("execution(* com.mystudy.service.*.*(..))")
    public void logBefore(){
        System.out.println("方法执行前");
    }
    @After("execution(* com.mystudy.service.*.*(..))")
    public void logAfter(){
        System.out.println("方法执行后");
    }
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("方法调用环绕前");
        joinPoint.proceed();
        System.out.println("方法调用环绕前");
    }
}

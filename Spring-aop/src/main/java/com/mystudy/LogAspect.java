package com.mystudy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogAspect {
    @Before("execution(* com.mystudy.service.*.*(..))")
    public void logBefore(){
        System.out.println("方法执行之前");
    }
    @After("execution(* com.mystudy.service.*.*(..))")
    public void logAfter(){
        System.out.println("方法执行之后");
    }
    @Around("execution(* com.mystudy.service.*.*(..))")
    public void round(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("连接点执行之前");
        joinPoint.proceed();
        System.out.println("连接点执行之后");
    }


}

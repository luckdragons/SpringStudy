package com.mystudy;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LogAfter implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target + " 的 " + method.getName() + " 执行之后 返回的结果为：" + returnValue);
    }
}

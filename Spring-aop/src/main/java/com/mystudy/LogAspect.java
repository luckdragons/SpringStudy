package com.mystudy;

public class LogAspect {
    public void logBefore(){
        System.out.println("方法执行之前");
    }
    public void logAfter(){
        System.out.println("方法执行之后");
    }
}

package com.mystudy;

import com.mystudy.pojo.Dog;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemXmlApplication {
    ApplicationContext context = null;
    @BeforeClass
    public static void init(){
        System.out.println("BeforeClass");
    }
    @Before
    public void setUp(){
        System.out.println("Before");
       // EmbeddedWebApplicationContext context = new EmbeddedWebApplicationContext();
        context = new FileSystemXmlApplicationContext("D:\\myworkspace\\SpringStudy\\spring-ioc\\src\\main\\resources\\applicationcontext.xml");
    }
    @Test
    public void test(){
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog);
    }
}

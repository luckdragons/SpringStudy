package com.mystudy;

import com.mystudy.config.ApplicationConfig;
import com.mystudy.pojo.Dog;
import com.mystudy.pojo.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 通过注解注入Bean
 */
public class AnnotationContextTest {
    private ApplicationContext context = null;
    @Before
    public void setUp(){
        //初始化容器
        context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    }

    /**
     * 以注解方式获取bean，默认以方法名为beanid
     */
    @Test
    public void test(){
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog);
    }

    /**
     * 获取指定bean的beanId
     */
    @Test
    public void test2(){
        String[] beanIds = context.getBeanNamesForType(Person.class);
        for (String beanId : beanIds) {
            System.out.println(beanId);
        }
    }

    /**
     * 查看所有注入的Bean
     */
    @Test
    public void test3(){
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}

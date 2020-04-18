package com.mystudy.test;

import com.mystudy.service.PersonService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPAnnotationTest {
    ApplicationContext context;
    @Autowired
    private PersonService personService;
    @Before()
    public void setup(){
        context = new AnnotationConfigApplicationContext("com.mystudy.service.*");
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
    @Test
    public void testWalk(){
        personService.walk();
    }
}

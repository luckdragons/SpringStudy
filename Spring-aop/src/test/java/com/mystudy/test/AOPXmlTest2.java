package com.mystudy.test;

import com.mystudy.service.LookUpShowSex;
import com.mystudy.service.PersonService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPXmlTest2 {
    ApplicationContext context;
    @Before()
    public void setup(){
        context = new ClassPathXmlApplicationContext("applicationcontext2.xml");
    }
    @Test
    public void testWalk(){
        PersonService personService = context.getBean("personService", PersonService.class);
        personService.walk();
    }
    @Test
    public void testShowSex(){
        LookUpShowSex lookupShowSex = context.getBean("lookupShowSex", LookUpShowSex.class);
        lookupShowSex.print();
    }
}

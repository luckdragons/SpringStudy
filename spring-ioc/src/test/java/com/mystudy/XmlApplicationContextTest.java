package com.mystudy;

import static org.junit.Assert.assertTrue;

import com.mystudy.pojo.Dog;
import com.mystudy.pojo.User;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class XmlApplicationContextTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void getBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog);
    }
}

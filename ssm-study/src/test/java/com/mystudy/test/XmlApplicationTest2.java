package com.mystudy.test;

import com.mystudy.dao.UserMapper;
import com.mystudy.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class XmlApplicationTest2 {
    ApplicationContext context;
    UserMapper userMapper;
    @Before
    public void setup(){
        context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        userMapper = context.getBean("userMapper2", UserMapper.class);
    }
    @Test
    public void testFindById(){
        User user = userMapper.findById(1);
        System.out.println(user);
    }
    @Test
    public void testSave(){
        User user = new User();
        user.setName("test2");
        user.setAge(12);
        user.setSex("女");
        user.setAddress("上海");
        userMapper.save(user);
        System.out.println(user);
    }
    @Test
    public void testList(){
        List<User> userList = userMapper.list();
        userList.forEach(user -> {
            System.out.println(user);
        });

    }
}

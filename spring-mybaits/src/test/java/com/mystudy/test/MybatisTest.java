package com.mystudy.test;

import com.mystudy.dao.UserMapper;
import com.mystudy.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    SqlSession session;
    @Before
    public void setup() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sessionFactory.openSession(true);
    }
    @Test
    public void testFindById() throws IOException {
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.findById(1);
        System.out.println(user);
    }

    @Test
    public void testSave() throws IOException {
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setName("test1");
        user.setAge(12);
        user.setSex("男");
        user.setAddress("南京");
        mapper.save(user);
        System.out.println(user);
    }

    @Test
    public void testQuery() throws IOException {
        UserMapper mapper = session.getMapper(UserMapper.class);

        List<User> userList = mapper.list();
        userList.forEach(user->{
            System.out.println(user);
        });
    }

}

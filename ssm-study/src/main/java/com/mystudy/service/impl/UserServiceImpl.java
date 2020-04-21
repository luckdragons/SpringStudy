package com.mystudy.service.impl;

import com.mystudy.dao.UserMapper;
import com.mystudy.pojo.User;
import com.mystudy.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserMapper userDao;

    public void setUserDao(UserMapper userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(Integer id) {
       userDao.delete(id);
    }

    @Override
    public List<User> list() {
        User user = new User();
        user.setName("test3");
        user.setAge(15);
        user.setSex("女");
        user.setAddress("广州");
        save(user);
        //save(new User());
        int result = 1/0;
        delete(1);
        return userDao.list();
    }
}

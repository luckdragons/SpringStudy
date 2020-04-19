package com.mystudy.service.impl;

import com.mystudy.dao.UserMapper;
import com.mystudy.pojo.User;
import com.mystudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userDao;

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public void save(User user) {
       userDao.save(user);
    }
}

package com.mystudy.service.impl;

import com.mystudy.dao.UserDao;
import com.mystudy.pojo.User;
import com.mystudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService<User> {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }
}

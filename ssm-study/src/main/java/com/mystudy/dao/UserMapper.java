package com.mystudy.dao;

import com.mystudy.pojo.User;

import java.util.List;


public interface UserMapper {
    User findById(Integer id);
    void save(User user);
    List<User> list();
}

package com.mystudy.service;

import com.mystudy.pojo.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);

    void save(User user);

    void delete(Integer id);

    List<User> list();
}

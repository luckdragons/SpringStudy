package com.mystudy.service;

import com.mystudy.pojo.User;

import javax.jws.soap.SOAPBinding;

public interface UserService {
    User findById(Integer id);
    void save(User user);
}

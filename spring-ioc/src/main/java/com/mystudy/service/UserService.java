package com.mystudy.service;

import java.util.List;

public interface UserService<T> {
    List<T> queryAll();
}

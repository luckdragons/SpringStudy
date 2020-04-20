package com.mystudy.dao;

import com.mystudy.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sessionTemplate;

    public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
        this.sessionTemplate = sessionTemplate;
    }

    @Override
    public User findById(Integer id) {
        return sessionTemplate.getMapper(UserMapper.class).findById(id);
    }

    @Override
    public void save(User user) {
        sessionTemplate.getMapper(UserMapper.class).save(user);
    }

    @Override
    public List<User> list() {
        return sessionTemplate.getMapper(UserMapper.class).list();
    }
}

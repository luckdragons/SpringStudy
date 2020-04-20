package com.mystudy.dao;

import com.mystudy.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public User findById(Integer id) {
        return getSqlSession().getMapper(UserMapper.class).findById(id);
    }

    @Override
    public void save(User user) {
        getSqlSessionTemplate().getMapper(UserMapper.class).save(user);
    }

    @Override
    public List<User> list() {
        return getSqlSessionTemplate().getMapper(UserMapper.class).list();
    }

    @Override
    public void delete(Integer id) {
        getSqlSessionTemplate().getMapper(UserMapper.class).delete(id);
    }
}

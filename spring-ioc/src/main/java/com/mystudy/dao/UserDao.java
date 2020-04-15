package com.mystudy.dao;

import com.mystudy.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
    /**
     * 查询所有用户
     * @return
     */
    public List<User> queryAll(){
        User u1 = new User(1L,"U1",19,"男", "广州");
        User u2 = new User(2L,"U2",19,"男", "广州");
        User u3 = new User(3L,"U3",19,"男", "广州");
        User u4 = new User(4L,"U4",19,"男", "广州");
        List<User> userList = new ArrayList<>();
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);
        return  userList;
    }
}

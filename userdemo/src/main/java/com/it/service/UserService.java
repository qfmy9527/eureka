package com.it.service;

import com.it.entity.User;

import java.util.List;


public interface UserService {

    //查询所有
     List<User> selectAll(User user);

    //添加用户
     int addUser(User user);

    //删除用户信息
    int delUser(int id);
    //修改用户信息
    int udpUser(User user);

}

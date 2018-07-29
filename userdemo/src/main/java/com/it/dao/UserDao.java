package com.it.dao;

import com.it.entity.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;



@Mapper
public interface UserDao {

    //添加用户
     int addUser(User user);
   //查询所有
     List<User> selectAll(User user);
    //删除用户
    int delUser(int id);
    //修改用户信息
    int udpUser(User user);
}

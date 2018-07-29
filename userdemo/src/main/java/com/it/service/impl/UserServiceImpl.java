package com.it.service.impl;

import com.it.dao.UserDao;
import com.it.entity.User;
import com.it.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {


    @Resource
    private UserDao userDao;

    @Override
    public List<User> selectAll(User user) {
        System.out.println("serviceImpl.getName=="+user.getName());
        return userDao.selectAll(user);
    }

    @Override
    public int addUser(User user) {
        Integer ad=-1;

        if (userDao.addUser(user)==1){
            ad=1;
            System.out.println("添加成功");
         }
        /*if (ad==-1){
            System.out.println("删除失败");
        }*/
        return ad;
    }

    @Override
    public int delUser(int id) {
        Integer ad=-1;

        if (userDao.delUser(id)==1){
            ad=1;
            System.out.println("删除成功");
        }
        /*if (ad==-1){
            System.out.println("删除失败");
        }*/
        return ad;
    }

    @Override
    public int udpUser(User user) {

        return userDao.udpUser(user);
    }

}

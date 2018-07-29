package com.it.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.it.entity.User;
import com.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //添加数据
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public Map<String, Object> addUser(User user) {
//        System.out.println("getName==" + user.getName());
//        System.out.println("getBirthday==" + user.getBirthday());
//        System.out.println("getAddress==" + user.getAddress());
        Map<String, Object> map = new HashMap<String, Object>();
        if (userService.addUser(user) == 1) {
            map.put("message", "新增成功");
            map.put("userList", userService.selectAll(user));
        } else
            map.put("message", "新增失败");
        return map;
    }



    //查询数据
    @RequestMapping(value = "/selectAll",method = RequestMethod.POST)
    public List<User> selectAll(User user) {

        return userService.selectAll(user);
    }


    //删除用户
    @RequestMapping(value = "/delUser/{id}",method = RequestMethod.DELETE)
    public Map<String, Object> delUser(@PathVariable("id") Integer id) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (userService.delUser(id) == 1) {
            map.put("message", "删除成功");
        } else {
            map.put("message", "删除失败");
        }
        return map;
    }

    @RequestMapping(value = "/updUser",method = RequestMethod.POST)
    public Map<String, Object> updUser(User user) {

        Map<String, Object> map = new HashMap<String, Object>();
            map.put("修改前信息",userService.selectAll(user));
        Map<String, Object> map1 = new HashMap<String, Object>();
        user.setId(user.getId());
        if (userService.udpUser(user)==1) {
            map.put("message", "修改成功");
            map.put("message",userService.selectAll(user));
        } else {
            map.put("message", "修改失败");
        }
        map.put("修改后信息",map1);
        return map;


    }




}
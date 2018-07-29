package com.it.rest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name= "user-service")
//注册的生产者名称
public interface Feign {
    //这个接口要和远程调用的接口一样，参数，接口名，返回类型
    @RequestMapping(value = "/demo")
    public String hellodemo();

    //添加数据
    @RequestMapping(value ="/user/addUser")
    public  String  addUser();
    //添加数据
    @RequestMapping(value ="/user/selectAll")
    public String aselectAll();
    //删除用户
    @RequestMapping(value = "/user/delUser/{id}")
    public  String delUser(@PathVariable("id") Integer id);

//修改用户
    @RequestMapping(value = "/user/updUser")
    public String updUser();

}


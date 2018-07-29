package com.it.controller;

import com.it.rest.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    Feign feign;
    @RequestMapping(value = "/demo")
    public String hello(){

        return feign.hellodemo();
    }
    @RequestMapping("/addUser")
    public  String add(){

        return feign.addUser();
    }

    @RequestMapping("/selectAll")
    public String selectAll(){

        return feign.aselectAll();
        }
        @RequestMapping("/delUser/{id}")
        public  String delUser(@PathVariable("id") Integer id){
        return feign.delUser(id);
        }

    @RequestMapping("/updUser")
    public String updUser(){

        return feign.updUser();
    }

}

package com.it.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

     @RequestMapping("/demo")
    public String demo(){
         System.out.println("这是我的第一个输出的实例！");
         return "你好！demo";
     }


     @RequestMapping("/index")
    public  String index(){
         return "home";
     }




}

package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoApplication {

//    @Resource
//    UserDao userDao;
//      private UserDao userDao;
    public static void main(String[] args) {

       SpringApplication.run(DemoApplication.class, args);
        System.out.println("spring Boot 启动成功了！");
    }

//    @RequestMapping("/all")
//    public List<User> all(){
//        List<User> userList = userDao.selectAll();
//        return userList;
//    }
 /*   @RequestMapping("/selectAll")
    public List<User> selectAll(User u){
       return userDao.selectAll(u);
    }*/


}

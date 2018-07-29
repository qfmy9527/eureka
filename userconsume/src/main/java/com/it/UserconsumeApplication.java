package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@EnableDiscoveryClient //启用服务注册与发现
@EnableFeignClients  //启用feign进行远程调用
@SpringBootApplication
public class UserconsumeApplication {

    public static void main(String[] args) {

        SpringApplication.run(UserconsumeApplication.class, args);
        System.out.println("spring Boot 启动成功");
    }


}

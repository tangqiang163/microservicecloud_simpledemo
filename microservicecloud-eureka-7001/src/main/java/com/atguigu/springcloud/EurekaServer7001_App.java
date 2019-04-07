package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 用在启动类上  表示该服务为Eureka组件服务器
public class EurekaServer7001_App {

    public static void main(String[] args){

        SpringApplication.run(EurekaServer7001_App.class,args);
    }
}

package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 表示该项目是Eureka项目的服务端
public class EurekaServer7003_App {

    public static void main(String[] args){

        SpringApplication.run(EurekaServer7003_App.class,args);
    }
}

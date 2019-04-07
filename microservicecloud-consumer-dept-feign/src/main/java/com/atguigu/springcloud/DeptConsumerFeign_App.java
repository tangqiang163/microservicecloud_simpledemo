package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient // 表示的开启Eureka客户端功能使用
//@RibbonClient(name="microservicecloud-dept")
@EnableFeignClients(basePackages = {"com.atguigu.springcloud"})
public class DeptConsumerFeign_App {

    public static void main(String[] args){


        SpringApplication.run(DeptConsumerFeign_App.class,args);
    }


}

package com.atguigu.springcloud;

import com.atguigu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient // 表示的开启Eureka客户端功能使用
@RibbonClient(name="microservicecloud-dept",configuration = MySelfRule.class)
public class DeptConsumer80_App {

    public static void main(String[] args){


        SpringApplication.run(DeptConsumer80_App.class,args);
    }


}

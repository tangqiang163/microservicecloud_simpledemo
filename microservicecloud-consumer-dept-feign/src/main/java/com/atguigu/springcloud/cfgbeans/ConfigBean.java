package com.atguigu.springcloud.cfgbeans;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {


    @Bean
    @LoadBalanced // 开启针对客户端的负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


//    @Bean
//    public IRule getChooseRule(){
//        return new RandomRule();
//    }

}

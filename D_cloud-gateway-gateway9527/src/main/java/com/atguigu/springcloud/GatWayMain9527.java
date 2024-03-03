package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author:厚积薄发
 * @create:2022-05-17-10:19
 */
@SpringBootApplication
@EnableEurekaClient
public class GatWayMain9527 {
    public static void main(String[] args){
        SpringApplication.run(GatWayMain9527.class,args);
    }
}

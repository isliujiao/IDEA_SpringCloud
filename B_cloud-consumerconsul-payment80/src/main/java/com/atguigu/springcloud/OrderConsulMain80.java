package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author:厚积薄发
 * @create:2022-05-12-10:21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain80 {

    public static void main(String[] args){
        System.out.println();
        SpringApplication.run(OrderConsulMain80.class,args);
    }

}

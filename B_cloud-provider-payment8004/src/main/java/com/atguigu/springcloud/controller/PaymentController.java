package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author:厚积薄发
 * @create:2022-05-11-21:09
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private  String serverPort;

    @RequestMapping("/payment/zk")
    public String paymentzk(){
        return "Springcloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }

}

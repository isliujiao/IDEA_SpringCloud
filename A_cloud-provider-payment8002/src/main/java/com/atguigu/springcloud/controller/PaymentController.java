package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.bean.CommonResult;
import com.atguigu.springcloud.bean.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author:厚积薄发
 * @create:2022-05-10-9:20
 */
@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult save(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        if(result > 0){
            return new CommonResult(200, "插入成功,serverPort: " + serverPort, result);
        }else {
            return new CommonResult(400, "插入数据库失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentId(id);
        if(payment != null){
            return new CommonResult(200, "查询成功,serverPort: "+serverPort , payment);
        }else {
            return new CommonResult(400, "查询失败，对应id：" + id, null);
        }
    }

    @GetMapping("/payment/getid/{id}")
    public Payment getId(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentId(id);
        return payment;
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}

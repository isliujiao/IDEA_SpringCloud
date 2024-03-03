package com.atguigu.springcloud.alibaba.service;


import com.atguigu.springcloud.bean.CommonResult;
import com.atguigu.springcloud.bean.Payment;
import org.springframework.stereotype.Component;

/**
 * @author:厚积薄发
 * @create:2022-06-09-12:39
 */
@Component
public class PaymentFallbackImpl implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444444,"服务降级返回,没有该流水信息",new Payment(id, "errorSerial......"));
    }

}

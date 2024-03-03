package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * 为实现解耦，将所有fullback做统一处理
 * @author:厚积薄发
 * @create:2022-05-15-11:59
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService fall back--paymentInfo_OK (ㄒoㄒ)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService fall back -- paymentInfo_TimeOut (ㄒoㄒ)";
    }
}

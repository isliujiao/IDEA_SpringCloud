package com.atguigu.springcloud.service;

import com.atguigu.springcloud.bean.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author:厚积薄发
 * @create:2022-05-10-9:15
 */

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentId(@Param("id") Long id);
}

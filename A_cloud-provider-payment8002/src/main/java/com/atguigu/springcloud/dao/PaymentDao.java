package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.bean.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author:厚积薄发
 * @create:2022-05-10-9:04
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentId(@PathVariable("id") Long id);

}

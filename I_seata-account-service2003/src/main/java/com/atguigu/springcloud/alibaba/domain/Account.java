package com.atguigu.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author:厚积薄发
 * @create:2022-06-10-11:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private Long id;
    //用户id
    private Long userId;
    //总额度
    private BigDecimal total;
    //已用额度
    private BigDecimal used;
    //剩余额度
    private BigDecimal residue;

}

package com.atguigu.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @author:厚积薄发
 * @create:2022-06-10-11:18
 */
@Data
public class Storage {
    private Long id;
    /**
     * 产品id
     */
    private Long productId;
    /**
     * 总库存
     */
    private Integer total;
    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}

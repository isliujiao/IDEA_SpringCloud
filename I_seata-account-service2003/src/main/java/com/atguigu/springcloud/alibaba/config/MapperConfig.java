package com.atguigu.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author:厚积薄发
 * @create:2022-06-10-11:59
 */
@MapperScan("com.atguigu.springcloud.alibaba.dao")
@Configuration
public class MapperConfig {

}

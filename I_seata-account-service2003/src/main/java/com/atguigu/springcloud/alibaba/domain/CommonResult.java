package com.atguigu.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:厚积薄发
 * @create:2022-06-10-11:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{

    private Integer code;//状态码
    private String message;//相应信息
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}

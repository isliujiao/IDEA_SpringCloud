package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.bean.CommonResult;
import com.atguigu.springcloud.bean.Payment;

/**
 * @author:厚积薄发
 * @create:2022-06-08-12:22
 */

public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException blockException) {
        return new CommonResult(4444, "按客户自定义,global handlerException---1");
    }

    public static CommonResult handlerException2(BlockException blockException) {
        return new CommonResult(4444, "按客户自定义,global handlerException---2");
    }

}

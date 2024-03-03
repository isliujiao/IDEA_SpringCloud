package com.atguigu.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author:厚积薄发
 * @create:2022-06-06-11:09
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
//        try {
//            Thread.sleep(800);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "------------<h1>TestA</h1>----------";
    }
    @GetMapping("/T/testA")
    public String testTA(){

        return "------------<h1>T<====>TestA</h1>----------";
    }
    @GetMapping("/T/testB")
    public String testTB(){

        return "------------<h1>T<====>TestB</h1>----------";
    }
     @GetMapping("/testB")
    public String testB(){
        return "------------TestB----------";
    }


    @GetMapping("/testD")
    public String testD()
    {
        //暂停几秒钟线程
        try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
        log.info("testD 测试RT");
        return "------testD";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2){
        return "--------testHotKey";
    }

    public String deal_testHotKey(String p1, String p2, BlockException exception){
        return "--------deal_testHotKey,/(ㄒoㄒ)/~~";
    }

}

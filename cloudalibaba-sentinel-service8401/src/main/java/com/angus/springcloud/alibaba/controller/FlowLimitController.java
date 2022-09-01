package com.angus.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * Description :
 * Created by Angus on 2022/8/27 15:20
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }


    @GetMapping("/testB")
    public String testB() {
        return "------testB";
    }


    @GetMapping("/testD")
    public String tesrD() throws InterruptedException {
        //暂停几秒钟线程
        TimeUnit.SECONDS.sleep(1);
        log.info("testD  测试RT");

        return "-----testD";
    }
}

package com.example.logging.aop.module.ping;

import com.example.logging.aop.utils.LogExecutionTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping(value = "/ping")
    @LogExecutionTime
    public void test() throws InterruptedException {
        Thread.sleep(2000);
    }
}
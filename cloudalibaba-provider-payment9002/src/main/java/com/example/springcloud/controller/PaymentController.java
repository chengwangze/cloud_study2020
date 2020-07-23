package com.example.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 9001端口的服务控制类
 *
 * @author cheng
 * @Date 2020/7/23 19:35
 */
@RestController
public class PaymentController {
    
    @Value("${server.port}")
    private String serverPort;
    
    @GetMapping("/payment/port")
    public String getServerPort() {
        return serverPort;
    }
    
}

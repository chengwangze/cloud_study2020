package com.example.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 订单控制器
 *
 * @author cheng
 * @Date 2020/7/23 20:13
 */
@RestController
public class OrderNacosController {
    @Autowired
    private RestTemplate restTemplate;
    
    @Value("${service-url.nacos-user-service}")
    private String serverURL;
    
    @GetMapping("/consumer/payment/port")
    public String paymentInfo() {
        return restTemplate.getForObject(serverURL + "/payment/port", String.class);
    }
}

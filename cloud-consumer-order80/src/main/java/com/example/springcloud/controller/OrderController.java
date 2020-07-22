package com.example.springcloud.controller;

import com.example.springcloud.entities.CommonResult;
import com.example.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * order控制器
 *
 * @author cheng
 * @Date 2020/7/22 15:19
 */
@RestController
@Slf4j
public class OrderController {
    /**
     * 使用RestTemplate调用其他服务的接口
     */
    @Resource
    private RestTemplate restTemplate;
    
    private static final String PAYMENT_URL = "http://localhost:8002";
    
    
    //private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
    
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }
    
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        // 注意拼接id
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }
}

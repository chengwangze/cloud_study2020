package com.example.springcloud.controller;

import com.example.springcloud.entities.CommonResult;
import com.example.springcloud.entities.Payment;
import com.example.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * payment控制器
 *
 * @author cheng
 * @Date 2020/7/22 14:10
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    
    /**
     * 创建payment
     *
     * @param payment 传入的payment
     * @return 插入的记录数封装
     */
    @PostMapping("/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果：" + result);
        if (result > 0) {
            return new CommonResult<>(200, "插入数据库成功");
        }
        return new CommonResult<>(444, null);
    }
    
    /**
     * 按照id查询记录
     *
     * @param id 要查询的id
     * @return 查询到的结果封装
     */
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("插入结果：" + payment);
        if (payment != null) {
            return new CommonResult<>(200, "查询成功", payment);
        }
        return new CommonResult<>(444, "没有对应记录", null);
    }
}

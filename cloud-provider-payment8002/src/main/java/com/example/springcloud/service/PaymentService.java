package com.example.springcloud.service;

import com.example.springcloud.entities.Payment;

/**
 * payment业务类
 *
 * @author cheng
 * @Date 2020/7/22 14:04
 */
public interface PaymentService {
    /**
     * 新增payment
     *
     * @param payment 要插入数据库的payment
     * @return 插入的条数
     */
    int create(Payment payment);
    
    /**
     * 安装id查询payment
     *
     * @param id 传入的id
     * @return 按照id查询到的结果
     */
    Payment getPaymentById(Long id);
}

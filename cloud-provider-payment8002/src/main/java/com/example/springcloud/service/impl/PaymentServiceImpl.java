package com.example.springcloud.service.impl;

import com.example.springcloud.dao.PaymentDao;
import com.example.springcloud.entities.Payment;
import com.example.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * payment业务的实现类
 *
 * @author cheng
 * @Date 2020/7/22 14:06
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    
    /**
     * 新增payment
     *
     * @param payment 要插入数据库的payment
     * @return 插入的条数
     */
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }
    
    /**
     * 安装id查询payment
     *
     * @param id 传入的id
     * @return 按照id查询到的结果
     */
    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

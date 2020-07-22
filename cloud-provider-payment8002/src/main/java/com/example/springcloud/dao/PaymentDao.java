package com.example.springcloud.dao;

import com.example.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * payment的增删改查接口
 *
 * @author cheng
 * @Date 2020/7/22 11:33
 */
@Mapper
public interface PaymentDao {
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
    Payment getPaymentById(@Param("id") Long id);
}

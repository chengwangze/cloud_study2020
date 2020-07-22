package com.example.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回结果装类
 *
 * @author cheng
 * @Date 2020/7/22 11:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    /**
     * 返回消息码
     */
    private Integer code;
    
    /**
     * 返回消息
     */
    private String message;
    
    /**
     * 返回的数据
     */
    private T data;
    
    /**
     * 不含数据的构造方法
     *
     * @param code    返回的消息码
     * @param message 返回的数据
     */
    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}

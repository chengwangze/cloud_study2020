package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 9528网关启动类
 *
 * @author cheng
 * @Date 2020/7/23 23:54
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayMain9528 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayMain9528.class, args);
    }
}

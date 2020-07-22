package com.example.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 模块的总配置类，等价于spring4中的ApplicantContext.xml
 *
 * @author cheng
 * @Date 2020/7/22 15:23
 */
@Configuration
public class ApplicationContextConfig {
    /**
     * 配置和注册bean，下面这个方法等价于<bean id="方法名get后的值" class="省略"><bean/>
     * 然后即可在项目中注入这个类
     *
     * @return RestTemplate实例
     */
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}

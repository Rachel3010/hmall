package com.hmall.api.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * Feign 客户端默认配置
 */
public class DefaultFeignConfig {
    
    @Bean
    public Logger.Level feignLogLevel() {
        return Logger.Level.FULL;
    }
}

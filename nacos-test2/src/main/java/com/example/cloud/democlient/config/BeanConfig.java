package com.example.cloud.democlient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public FeignInterceptor feignRequestInterceptor() {
        return new FeignInterceptor();
    }
}

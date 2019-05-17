package com.springcloud.demo.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        // return new RandomRule();// Ribbon默认是轮询，我自定义为随机
        // return new RoundRobinRule();// Ribbon默认是轮询，我自定义为随机
        // return new RetryRule(); // 测试失败，未解

        return new RandomRule_ZY();// 我自定义为每台机器5次
    }

}

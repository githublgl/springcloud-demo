package com.springcloud.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.springcloud.demo.myrule.MySelfRule;

/**
 * 这个springcloud-demo-consumer是配合springcloud-demo-zuul-gateway9528做测试的
 * 
 * @author luke
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient // 服务发现
// 在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
// @RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
@RibbonClient(
    name = "SPRINGCLOUD-DEMO-PROVIDER-DEPT", configuration = MySelfRule.class)
public class DeptConsumer80_Eureka_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Eureka_App.class, args);
    }

}

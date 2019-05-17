package com.springcloud.demo.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 这个zuul是代理消费者springcloud-demo-consumer的
 * 视频里讲解的是springcloud-demo-zuul-gateway9527代理服务提供者springcloud-demo-provider-dept
 * 当时的逻辑有点懵，zuul用来代理provider？意义何在？去网上查了一下，zuul主要用来拦截consumer，应该是讲师只是举个例子，需要我们灵活应用吧
 * 这样的话，consumer也需要被eureka发现，需要加@EnableDiscoveryClient
 * 但是感觉有点怪怪的，可能是没从dubbo的思维方式转变过来吧，consumer被eureka发现？怎么感觉consumer也变成了provider
 * QQ：543991131欢迎技术交流
 * 
 * @author luke
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9528_StartSpringCloudApp {

    public static void main(String[] args) {
        SpringApplication.run(Zuul_9528_StartSpringCloudApp.class, args);
    }

}

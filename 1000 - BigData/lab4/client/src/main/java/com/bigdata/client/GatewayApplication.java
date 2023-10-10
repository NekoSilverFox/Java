/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2023/10/10 19:12
 * @Author : NekoSilverfox
 * @FileName: GatewayApplication
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.bigdata.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class GatewayApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
//        new SpringApplicationBuilder(GatewayApplication.class).run(args);
    }

//    @Bean
//    public CustomZuulFilter customZuulFilter() {
//        return new CustomZuulFilter();
//    }
}
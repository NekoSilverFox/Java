/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2023/10/10 19:45
 * @Author : NekoSilverfox
 * @FileName: ServerWebConfig
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.bigdata.server;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan({ "com.bigdata.server" })
public class ServerWebConfig implements WebMvcConfigurer {
}

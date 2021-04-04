/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/4 23:18
 * @Author : NekoSilverfox
 * @FileName: UserConfig2
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.config;

import com.foxthere.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.foxthere.pojo")
@Import(UserConfig2.class)
public class UserConfig2 {
    // 注册一个Bean，就相当于我们之前写的一个Bean标签
    // 这个方法的名字，就相当于Bean标签的属性
    // 这个地方的返回值，就相当于Bean标签中的class属性
    @Bean
    public User getUser() {
        return new User();  // 返回要注入到Bean的对象
    }
}

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/4 23:06
 * @Author : NekoSilverfox
 * @FileName: UserConfig
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.config;

import com.foxthere.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 这个也会被Spring托管，注册到容器中，因为他本来就是一个 @Component
// @Configuration 代表这是一个配置类，就是 ApplicationContext.xml
@Configuration
public class UserConfig {

    // 注册一个Bean，就相当于我们之前写的一个Bean标签
    // 这个方法的名字，就相当于Bean标签的属性
    // 这个地方的返回值，就相当于Bean标签中的class属性
    @Bean
    public User getUser() {
        return new User();  // 返回要注入到Bean的对象
    }
}

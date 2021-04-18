/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/18 18:49
 * @Author : NekoSilverfox
 * @FileName: JavaConfig
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy  // 开启自动代理
public class JavaConfig {
}

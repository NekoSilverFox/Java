/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/19 14:43
 * @Author : NekoSilverfox
 * @FileName: HelloService
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String hello(String name) {
        return "Hello " + name;
    }
}

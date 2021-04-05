/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/5 22:36
 * @Author : NekoSilverfox
 * @FileName: AfterLog
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("执行了 " + method.getName() + " 方法，返回结果为 " + returnValue);

    }
}

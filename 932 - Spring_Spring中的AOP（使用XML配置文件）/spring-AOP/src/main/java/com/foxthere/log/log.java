/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/5 22:27
 * @Author : NekoSilverfox
 * @FileName: log
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class log implements MethodBeforeAdvice {

    // method - 要执行目标对象的方法
    // objects - 参数
    // target - 目标对象
    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "方法的" + method.getName() + "被执行了");
    }
}

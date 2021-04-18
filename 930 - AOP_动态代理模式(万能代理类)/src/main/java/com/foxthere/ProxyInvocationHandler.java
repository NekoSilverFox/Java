/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/5 16:38
 * @Author : NekoSilverfox
 * @FileName: ProxyInvocationHandler
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // 生成得到的代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );
    }

    /** 处理代理实例，并返回结果
     * @param proxy 代理对象
     * @param method 代理的方法
     * @param args 方法的参数
     * @return 方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());  // 利用反射技术
        Object result = method.invoke(target, args);
        return result;
    }


    // 增加的方法
    public void log(String msg) {
        System.out.println("执行了" + msg + "方法");
    }
}

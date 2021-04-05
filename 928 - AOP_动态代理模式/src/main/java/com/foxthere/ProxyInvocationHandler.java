/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/5 15:34
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

// 我们会用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成、得到代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),   // 要代理的类是那一个类，在哪个位置
                rent.getClass().getInterfaces(),   // 要代理的接口是哪一个
                this);  // 代表自己的 InvocationHandler （调用自己处理） 【没听懂】
    }



    // 处理代理实例并返回结果
    @Override                       // method 是一个反射对象
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        seeHouse();
        agencyFee();
        writeContract();

        // 动态代理的本质就是使用反射机制实现
        Object result = method.invoke(rent, args);
        return result;
    }

    public void seeHouse() {
        System.out.println("中介带着你去看房子");
    }

    public void writeContract() {
        System.out.println("中介跟你签合同");
    }

    public void agencyFee() {
        System.out.println("收你中介费");
    }
}

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/5 23:14
 * @Author : NekoSilverfox
 * @FileName: DiyPointcut
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.diy;

public class DiyPointcut {
    public void before() {
        System.out.println("============方法执行前============");
    }

    public void after() {
        System.out.println("============方法执行后============");
    }
}

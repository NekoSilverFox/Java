/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/5 13:48
 * @Author : NekoSilverfox
 * @FileName: Master
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere;

// 房东
public class Master implements Rent {

    @Override
    public void rent() {
        System.out.println("房东要出租房子了");
    }
}

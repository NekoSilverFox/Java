/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/18 18:41
 * @Author : NekoSilverfox
 * @FileName: MyCalculationImpl
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere;

import org.springframework.stereotype.Component;

@Component
public class MyCalculationImpl implements MyCalculation {
    @Action
    @Override
    public Integer add(int l, int r) {
        return l + r;
    }

    @Action
    @Override
    public void sub(int l, int r) {
        System.out.println( l + " - " + r + " = " + (l / r));
    }
}

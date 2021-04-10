/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 14:57
 * @Author : NekoSilverfox
 * @FileName: Ship
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere;

public class Ship {
    private String name;
    private int ton;

    public Ship() {
    }

    public Ship(String name, int ton) {
        this.name = name;
        this.ton = ton;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", ton=" + ton +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTon() {
        return ton;
    }

    public void setTon(int ton) {
        this.ton = ton;
    }
}

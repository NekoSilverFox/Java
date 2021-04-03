/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/3 13:19
 * @Author : NekoSilverfox
 * @FileName: UserT
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere;

public class UserT {
    private String name;

    public UserT() {
        System.out.println("调用了UserT的无参构造！");
    }

    public UserT(String user_con) {
        this.name = user_con;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + name + '\'' +
                '}';
    }

    public String getUser() {
        return name;
    }

    public void setUser(String user_set) {
        this.name = user_set;
    }

    public void show() {
        System.out.println("name=" + name);
    }
}

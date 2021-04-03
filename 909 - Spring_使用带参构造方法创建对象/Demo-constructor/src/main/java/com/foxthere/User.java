/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/3 12:26
 * @Author : NekoSilverfox
 * @FileName: User
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere;

public class User {
    private String name;

    public User() {
        System.out.println("调用了User的无参构造！");
    }

    public User(String user) {
        this.name = user;
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

    public void setUser(String user) {
        this.name = user;
    }

    public void show() {
        System.out.println("name=" + name);
    }
}

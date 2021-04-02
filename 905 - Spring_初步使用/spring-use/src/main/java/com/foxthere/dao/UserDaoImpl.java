/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/2 15:23
 * @Author : NekoSilverfox
 * @FileName: UserDaoImpl
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.dao;

public class UserDaoImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("UserDaoImpl 获取用户数据");
    }
}

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/2 15:34
 * @Author : NekoSilverfox
 * @FileName: UserDaoMySQLImpl
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.dao;

public class UserDaoMySQLImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("MySQL 获取用户数据");
    }
}

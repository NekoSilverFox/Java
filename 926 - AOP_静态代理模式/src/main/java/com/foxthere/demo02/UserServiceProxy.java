/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/5 14:15
 * @Author : NekoSilverfox
 * @FileName: UserServiceProxy
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.demo02;

/**
 * 为什么使用代理模式？
 *  因为直接改动源代码是公司中的大忌！！！
 */



public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    public UserServiceProxy() {
    }

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }


    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    // 日志方法
    public void log(String msg) {
        System.out.println("[Debug] 使用了" + msg + "方法");
    }
}

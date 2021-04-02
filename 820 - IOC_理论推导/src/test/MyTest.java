/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/2 15:32
 * @Author : NekoSilverfox
 * @FileName: MyTest
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package test;

import main.com.foxthere.dao.UserDaoImpl;
import main.com.foxthere.dao.UserDaoMySQLImpl;
import main.com.foxthere.dao.UserDaoOracleImpl;
import main.com.foxthere.service.UserService;
import main.com.foxthere.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserDao(new UserDaoMySQLImpl());
        userService.getUser();

        userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();

        userService.setUserDao(new UserDaoImpl());
        userService.getUser();
    }
}

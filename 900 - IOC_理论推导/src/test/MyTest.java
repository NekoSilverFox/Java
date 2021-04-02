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

/**
 * IoC (Inversion of Control) 控制反转，是一种设计思想，DI（依赖注入）是实现IoC的一种方法
 * 将服务的创建交给了用户，主动权在用户，用户可以根据需求来调用相应的业务层。使得程序的灵活性更高了
 *
 * 控制反转IoC(Inversion of Control)是说创建对象的控制权进行转移，以前创建对象的主动权和创建时机是由自己把控的，
 * 而现在这种权力转移到第三方
 */

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

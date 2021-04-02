/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/2 15:30
 * @Author : NekoSilverfox
 * @FileName: UserServiceImpl
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package main.com.foxthere.service;

import main.com.foxthere.dao.UserDao;
import main.com.foxthere.dao.UserDaoImpl;
import main.com.foxthere.dao.UserDaoMySQLImpl;
import main.com.foxthere.dao.UserDaoOracleImpl;

/**
 * 业务层接口的实现类
 */

public class UserServiceImpl implements UserService {
//    private UserDao userDao = new UserDaoImpl();
//    private UserDao userDao = new UserDaoMySQLImpl();
//    private UserDao userDao = new UserDaoOracleImpl();
    private UserDao userDao;

    @Override
    public void getUser() {
        userDao.getUser();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}

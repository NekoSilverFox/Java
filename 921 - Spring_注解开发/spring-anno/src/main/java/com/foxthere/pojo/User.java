/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/4 19:14
 * @Author : NekoSilverfox
 * @FileName: User
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Component(英：组件) 等价于 ：<bean id="user" class="com.foxthere.pojo.User"/>
@Component
@Scope("singleton")  // 标记为单例模式
public class User {

    @Value("冰糖雪狸")  // 放在setter上也可以，相当于 <property name="name" value="冰糖雪狸"/>
    private String user_name;

    public String getUser_name() {
        return user_name;
    }

    @Value("冰糖雪狸2")  // 在 setter 上也可以注入
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_name='" + user_name + '\'' +
                '}';
    }
}

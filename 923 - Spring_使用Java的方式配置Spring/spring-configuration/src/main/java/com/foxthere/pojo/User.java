/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/4 23:03
 * @Author : NekoSilverfox
 * @FileName: User
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


// 这里有个注解的意思是，就是说明这个类被Spring接管了，注册到了容器中
@Component
public class User {
    @Value("冰糖雪狸")
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

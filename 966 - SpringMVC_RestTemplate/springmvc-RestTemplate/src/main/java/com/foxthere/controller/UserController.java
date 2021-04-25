/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/25 21:20
 * @Author : NekoSilverfox
 * @FileName: UserController
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.controller;

import com.foxthere.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = "/user01/{name}/{age}")
    @ResponseBody  // 配合`@Controller`使用，增加这个注解说明不会经过视图解析器，会直接返回一个字符串
    public static Object getUser(/*Model model, */@PathVariable String name, @PathVariable int age) {
        System.out.println("接收到的 name：" + name + " age: " + age);

        User user = new User(name, age);

//        model.addAttribute("msg", user);

        System.out.println("toString: " + user);

        return user;
    }
}

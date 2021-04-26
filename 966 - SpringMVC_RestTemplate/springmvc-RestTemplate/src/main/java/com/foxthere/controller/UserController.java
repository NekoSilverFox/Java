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
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = "/getUser/{name}/{age}")
    @ResponseBody  // 配合`@Controller`使用，增加这个注解说明不会经过视图解析器，会直接返回一个字符串
    public Object getUser(/*Model model, */@PathVariable/*("userName")*/ String name, @PathVariable/*("userAge")*/ int age) {
        System.out.println("接收到的 name：" + name + " age: " + age);

        User user = new User(name, age);

//        model.addAttribute("msg", user);

        System.out.println("toString: " + user);

        return user;
    }


//    @PostMapping("/postUser")
    @RequestMapping("/postUser")
    @ResponseBody  // 配合`@Controller`使用，增加这个注解说明不会经过视图解析器，会直接返回一个字符串
    public Object postUser(User user) {
        return user;
    }


    @RequestMapping("/addUser3")
    @ResponseBody  // 配合`@Controller`使用，增加这个注解说明不会经过视图解析器，会直接返回一个字符串
    public User addUser3(@RequestBody User user) {
        user.setName(user.getName() + " from @RequestBody");
        return user;
    }
}

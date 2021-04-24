/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/24 22:52
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    // localhost:8080/user/mvc04 ? name=XXXX
    @RequestMapping("mvc04")  // 【重点】↓ 在前端里显示的请求，（可以不加，但最好加上！）
                                // 也就是说在url请求时必须用`localhost:8080/user/mvc04 ? username=XXXX`
    public String test01(@RequestParam("username") String name, Model model) {
//    public String test01(String name, Model model) {
        // 1. 接受前端的参数
        System.out.println("接收到前端的参数为：" + name);

        // 2. 将返回的结果传递给前端
        model.addAttribute("msg", name);

        // 3. 视图跳转
        return "test";
    }


    /**【重点】前端接受的是一个 id name age（User 对象）
     * 1. 接受前端用户的参数，判断参数的名字，假设名字直接在方法上，可以直接使用
     * 2. 假设传递的是一个 User，匹配 User 对象中的字段名 --> 那么 OK；否则匹配不上
     * @param user
     * @param model
     * @return
     */
    @RequestMapping("mvc05")
    public String test02(User user, Model model) {
        System.out.println(user);
        model.addAttribute("msg", user.toString());
        return "test";
    }
}

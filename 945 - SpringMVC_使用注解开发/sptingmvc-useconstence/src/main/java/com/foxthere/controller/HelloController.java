/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/22 14:00
 * @Author : NekoSilverfox
 * @FileName: HelloController
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/hello")  // 相当于所有前一个路径 // localhost:8080/hello/......
public class HelloController {

    @RequestMapping("/h1")
    public String hello(Model model) {
        // 封装数据
        // 向模型中添加属性 msg 与值，可以在JSP页面中取出并渲染
        Model msg = model.addAttribute("msg", "Hello Silverfox here is SpringMVC use annotation printing!!!");

        return "hello";  // 会被视图解析器处理
    }
}

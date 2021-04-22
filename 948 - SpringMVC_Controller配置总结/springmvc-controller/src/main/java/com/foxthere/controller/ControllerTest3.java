/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/22 21:19
 * @Author : NekoSilverfox
 * @FileName: ControllerTest2
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // 代表这个类会被 Spring 接管，被这个注解的类中的所有方法，并且有具体的页面可以跳转，那么就会被视图解析器解析
@RequestMapping("c3")
public class ControllerTest3 {

    @RequestMapping("/c4/t2")  // 也可以这样设置请求的路径
    public String test1(Model model) {  // Model hi一个视图，是 ModelAndView 的简化版
        model.addAttribute("msg", "淦淦淦淦淦");

        return "test";
    }

}

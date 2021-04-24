/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/24 11:27
 * @Author : NekoSilverfox
 * @FileName: Demo01Forwarding
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class Demo01Forwarding {

    @RequestMapping("/a1/b1")
    public String test01(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        return "test";
    }

    // 在测试的时候把视图解析器注释了，如果没有注释return可以直接省略成 `test`
    @RequestMapping("/mvc01")
    public String forwardingMVC01(Model model) {
        model.addAttribute("msg", "冰糖雪狸111");

        // 不加前缀默认是转发
        return "/WEB-INF/jsp/test.jsp";  // 记得加 “斜杠/” ！！！
    }

    // 在测试的时候把视图解析器注释了，如果没有注释return可以直接省略成 `test`
    @RequestMapping("/mvc02")
    public String forwardingMVC02(Model model) {
        //【重点】转发
        model.addAttribute("msg", "冰糖雪狸222");
        return "forward:/WEB-INF/jsp/test.jsp";  // 加了 `forward:`前缀，代表转发
    }

    // 在测试的时候把视图解析器注释了，如果没有注释return可以直接省略成 `test`
    @RequestMapping("/mvc03")
    public String redirectMVC01(Model model) {
        // 【重点】redirect 重定向
        model.addAttribute("msg", "冰糖雪狸222");
        return "redirect:/index.jsp";  // 加了 `redirect:`前缀，代表重定向
    }
}

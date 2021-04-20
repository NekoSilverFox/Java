/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/19 23:56
 * @Author : NekoSilverfox
 * @FileName: HelloController
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 注意：我们这里先导入 Controller 接口
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        // 模型和视图
        ModelAndView modelAndView = new ModelAndView();

        // 封装对象，放在 ModeAndView 中
        modelAndView.addObject("msg", "HelloSpringMVC! Here is Silverfox!");

        // 封装要跳转的视图，放在 ModeAndView 中
        modelAndView.setViewName("hello"); //: /WEB-INF/jsp/hello.jsp

        return modelAndView;

    }
}

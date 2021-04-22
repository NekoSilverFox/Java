/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/22 13:40
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

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        // 业务代码
        String result = "Hello Silverfox here is SpringMVC printing!";
        modelAndView.addObject("msg", result);

        // 视图跳转
        modelAndView.setViewName("test");

        return modelAndView;
    }
}

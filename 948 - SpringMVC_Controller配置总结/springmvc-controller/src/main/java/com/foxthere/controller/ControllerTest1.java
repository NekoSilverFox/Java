/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/22 20:26
 * @Author : NekoSilverfox
 * @FileName: ControllerTest1
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 只要实现了 Controller 接口的类，说明这就是一个控制器了
public class ControllerTest1 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("msg", "Hello Silverfox here is ControllerTest1 printing!!!");

        modelAndView.setViewName("test");

        return modelAndView;
    }
}

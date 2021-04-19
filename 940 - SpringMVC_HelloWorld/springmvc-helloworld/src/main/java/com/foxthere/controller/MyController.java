/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/19 13:02
 * @Author : NekoSilverfox
 * @FileName: MyController
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.controller;

import com.foxthere.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@org.springframework.stereotype.Controller("/hello")
public class MyController implements Controller {
    @Autowired
    HelloService helloService;
    /**
     * 这个方法适用于处理请求
     * @param httpServletRequest 前端发送来的请求
     * @param httpServletResponse 服务端给前端的相应
     * @return 返回 ModelAndView（数据模型和视图）
     * @throws Exception
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("name", "Silverfox");
        System.out.println("helloservice.hello(\"Silverfox\") = " + helloService.hello("Silverfox"));
        return null;
    }
}

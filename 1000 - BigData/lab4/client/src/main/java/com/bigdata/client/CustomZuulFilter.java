/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2023/10/10 19:34
 * @Author : NekoSilverfox
 * @FileName: CustomZuulFilter
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.bigdata.client;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class CustomZuulFilter extends ZuulFilter {

    /**
     * Zuul 提供了四种过滤器的 API，分别为前置（Pre）、后置（Post）、路由（Route）和错误（Error）四种处理方式
     */
    @Override
    public String filterType() {
        System.out.println("Print from Custom filter pre");
        return "pre";
    }

    @Override
    public Object run() {
        final RequestContext ctx = RequestContext.getCurrentContext();
        ctx.addZuulRequestHeader("Test", "TestSample");

        HttpServletRequest request = ctx.getRequest();
        HttpServletResponse response = ctx.getResponse();
        System.out.println("Request Method: " + ctx.getRequest().getMethod());
        System.out.println("Request URL: " + ctx.getRequest().getRequestURL().toString());

        System.out.println("Add header to request");
        return null;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public int filterOrder() {
        return 999;
    }


}

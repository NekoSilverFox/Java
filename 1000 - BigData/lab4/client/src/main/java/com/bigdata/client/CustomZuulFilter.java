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

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class CustomZuulFilter extends ZuulFilter {

    @Override
    public Object run() {
        final RequestContext ctx = RequestContext.getCurrentContext();
        ctx.addZuulRequestHeader("Test", "TestSample");
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

    @Override
    public String filterType() {
        return "pre";
    }

}

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2023/10/3 17:30
 * @Author : NekoSilverfox
 * @FileName: ServerController
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.bigdata.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/server")
public class ServerController {
    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public String getData() {
        System.out.println("Returning data from server");
        return "Hello from server";
    }
}
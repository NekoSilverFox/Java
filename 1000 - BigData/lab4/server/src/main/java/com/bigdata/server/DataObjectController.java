/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2023/10/10 19:00
 * @Author : NekoSilverfox
 * @FileName: DataObjectController
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.bigdata.server;

import org.apache.commons.lang3.RandomStringUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class DataObjectController {
    @RequestMapping(value = "/data/{id}", method = RequestMethod.GET)
    @ResponseBody
    public DataObject findById(
            @PathVariable long id, HttpServletRequest req, HttpServletResponse res)
    {
        if (req.getHeader("Test") != null) {
            res.addHeader("Test", req.getHeader("Test"));
        }
        return new DataObject(id, RandomStringUtils.randomAlphanumeric(10));
    }
}

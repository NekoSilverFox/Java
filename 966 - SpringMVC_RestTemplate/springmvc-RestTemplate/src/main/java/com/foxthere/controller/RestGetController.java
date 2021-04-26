/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/25 23:02
 * @Author : NekoSilverfox
 * @FileName: RestTemplateController
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.controller;

import com.foxthere.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/get")
public class RestGetController {

    @Autowired
    RestTemplate restTemplate;


    //
    @GetMapping("/getForObject")
    @ResponseBody  // 配合`@Controller`使用，增加这个注解说明不会经过视图解析器，会直接返回一个对象
    public Object getForObject(/*Model model*/) {
        String url = "http://localhost:8080/user/getUser/冰糖雪狸/17";

        // 请求入参
        Map<String, Long> paramMap = new HashMap<>();

        User result = restTemplate.getForObject(url, User.class, paramMap);
        System.out.println("In getForObject: " + result);

//        model.addAttribute("msg", result);

        return result;
    }


    // http://localhost:8080/get/getForEntity
    @GetMapping("/getForEntity")
    @ResponseBody  // 配合`@Controller`使用，增加这个注解说明不会经过视图解析器，会直接返回一个对象
    public Object getForEntity() {
        String url = "http://localhost:8080/user/getUser/冰糖火火火狸/17";

        // 空的入参
        Map<String, Long> paramMap = new HashMap<>();

        // ResponseEntity 包装返回结果
        ResponseEntity<HashMap> responseEntity = restTemplate.getForEntity(url, HashMap.class, paramMap);

        // 返回状态码包装类
        HttpStatus statusCode = responseEntity.getStatusCode();

        // 返回状态码 http响应状态码，如成功时返回 200
        int statusCodeValue = responseEntity.getStatusCodeValue();

        // Http 返回头
        HttpHeaders headers = responseEntity.getHeaders();

        // 返回对应的请求结果
        return responseEntity.getBody();
    }

}

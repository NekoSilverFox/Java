/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/25 23:57
 * @Author : NekoSilverfox
 * @FileName: TestPostController
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.controller;

import com.foxthere.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("post")
public class RestPostController {
    @Autowired
    RestTemplate restTemplate;

    /**
     * 【失败】
     * @return
     */
    @GetMapping("postForObject")
    @ResponseBody  // 配合`@Controller`使用，增加这个注解说明不会经过视图解析器，会直接返回一个对象
    public Object postForObject() {
        String url = "http://localhost:8080/user/postUser";

        // Post 方法必须使用 MultiValueMap 传参；Object换成User也可以
        MultiValueMap<String, Object> paramMap = new LinkedMultiValueMap<>();
        paramMap.add("name", "在POST");
        paramMap.add("age", 14);

//        MultiValueMap<String, User> paramMap = new LinkedMultiValueMap<>();
//        User user1 = new User("冰糖雪狸在POST", 14);
//        paramMap.add("user", user1);

        // 返回对象
        User user = restTemplate.postForObject(url, paramMap, User.class);

        return user;
    }


    /** 【成功】
     * 【重点】@RequestBody 传参，需要使用 HTTPEntity 传参
     *  http://localhost:8080/user/addUser3
     *  也就说是说在 UserController 的第45行 里的参数要用 @RequestBody 注解修饰
     * @return
     */
    //
    //
    @GetMapping("postForObject2")
    @ResponseBody  // 配合`@Controller`使用，增加这个注解说明不会经过视图解析器，会直接返回一个对象
    public User postForObject02() {
        // 声明一个请求头
        HttpHeaders httpHeaders = new HttpHeaders();

        // application/json
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        // 远程访问的URL：
        String url = "http://localhost:8080/user/addUser3";

        /**
         * 此处使用 MultiValueMap 会报错
         *          MultiValueMap<String, Object> paramMap = new LinkedMultiValueMap<>();
         *         paramMap.add("name", "在POST");
         *         paramMap.add("age", 14);
         *
         * 此处应该使用 HaspMap 代替，但是会有警告
         */
        User user = new User();
        user.setName("淦淦淦淦淦淦淦淦淦淦淦淦淦淦淦淦淦淦淦淦淦淦淦");
        user.setAge(17);

        // 需要使用 HTTPEntity 传参                         把两个都传进去
        HttpEntity<User> entityParam = new HttpEntity<>(user, httpHeaders);

        User result = restTemplate.postForObject(url, entityParam, User.class);
        return result;
    }
}

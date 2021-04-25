/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/25 13:07
 * @Author : NekoSilverfox
 * @FileName: UserController
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.foxthere.pojo.User;
import com.foxthere.units.JsonUnit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//@RestController // 说明 只会返回字符串，不会走视图解析器了
@Controller // 走视图解析器
public class UserController {

    @RequestMapping(value = "/json01"/*, produces = "application/json;charset=utf-8"*/)  // 【重点】后面增加了一个乱码解析 （但是在xml配置文件里配置了总的这里就不用写了）
    @ResponseBody  // 配合`@Controller`使用，增加这个注解说明不会经过视图解析器，会直接返回一个字符串
    public String demoJackson01() throws JsonProcessingException {
        User user = new User("冰糖雪狸", 17, "M");

        // 使用 Jackson 中的 ObjectMapper 就会直接床架你一个字符串
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(user);

        return str;
    }

    @RequestMapping(value = "/json02"/*, produces = "application/json;charset=utf-8"*/)  // 【重点】后面增加了一个乱码解析 （但是在xml配置文件里配置了总的这里就不用写了）
    @ResponseBody  // 配合`@Controller`使用，增加这个注解说明不会经过视图解析器，会直接返回一个字符串
    public String demoJackson02() throws JsonProcessingException {
        User user1 = new User("冰糖雪狸1", 11, "M");
        User user2 = new User("冰糖雪狸2", 12, "M");
        User user3 = new User("冰糖雪狸3", 13, "M");
        User user4 = new User("冰糖雪狸4", 14, "M");

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        // 使用 Jackson 中的 ObjectMapper 就会直接床架你一个字符串
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(users);

        return str;
    }


    @RequestMapping(value = "/json03"/*, produces = "application/json;charset=utf-8"*/)  // 【重点】后面增加了一个乱码解析 （但是在xml配置文件里配置了总的这里就不用写了）
    @ResponseBody  // 配合`@Controller`使用，增加这个注解说明不会经过视图解析器，会直接返回一个字符串
    public String demoJackson03() throws JsonProcessingException {
        // 使用 Jackson 中的 ObjectMapper 就会直接返回你一个字符串
        ObjectMapper mapper = new ObjectMapper();
        Date date = new Date();

//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String format = simpleDateFormat.format(date);

        // 使用 ObjectMapper 格式化输出
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false); // 不使用时间戳的方式

        return mapper.writeValueAsString(date);  // 时间戳 Timestamp
    }


    @RequestMapping(value = "/json04"/*, produces = "application/json;charset=utf-8"*/)  // 【重点】后面增加了一个乱码解析 （但是在xml配置文件里配置了总的这里就不用写了）
    @ResponseBody  // 配合`@Controller`使用，增加这个注解说明不会经过视图解析器，会直接返回一个字符串
    public String demoJackson04() throws JsonProcessingException {
        Date date = new Date();

        return JsonUnit.getDate(date, "yyyy-MM-dd HH:mm:ss");
    }
}

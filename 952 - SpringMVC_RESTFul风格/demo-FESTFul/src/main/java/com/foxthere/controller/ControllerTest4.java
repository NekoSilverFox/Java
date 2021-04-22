/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/22 23:21
 * @Author : NekoSilverfox
 * @FileName: ControllerTest4
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerTest4 {

    /**
     * 最原始的风格 http://localhost:8080/add?l=3&r=5
     */
    @RequestMapping("/add")
    // 一定别忘了加 @PathVariable 注解！！！！
    public String oldStyle(int l, int r, Model model) {

        int result = l + r;

        model.addAttribute("msg", "结果为：" + result);

        return "test";
    }


    /**
     * 使用方式：http://localhost:8080/add/1/2
     */
    @RequestMapping("/add/{l}/{r}")
    // 一定别忘了加 @PathVariable 注解！！！！
    public String demoFESTFul01(Model model, @PathVariable int l, @PathVariable int r) {  // 在 MVC 中可以使用 @PathVariable注解，让方法的参数的值对应绑定到一个URL变量上
        int result = l + r;
        model.addAttribute("msg", "结果为：" + result);
        return "test";
    }


    /**
     * 使用方式：http://localhost:8080/add/1/2
     */
    @RequestMapping(value = "/add/{l}/{r}", method = RequestMethod.DELETE)   // 限定了请求的方式为 DELETE (默认为 GET 方式)
    // 一定别忘了加 @PathVariable 注解！！！！
    public String demoFESTFul02(Model model, @PathVariable int l, @PathVariable int r) {
        int result = l + r;
        model.addAttribute("msg", "结果为：" + result);
        return "test";
    }


    // 【重点】@GetMapping 注解表示只能通过 GET 的方法提交了
    @GetMapping(value = "/add/{l}/{r}")
    // 一定别忘了加 @PathVariable 注解！！！！
    public String demoFESTFul03(Model model, @PathVariable int l, @PathVariable int r) {
        int result = l + r;
        model.addAttribute("msg", "使用了 @GetMapping，结果为：" + result);
        return "test";
    }


    // 【重点】注意这里的请求路径和上面一模一样！！！！但是可以通过不同的请求方式调用
    // 比如使用表单的话就是调用了 POST 的方式调用（请求）；可以理解为 POST 是服务器主动发给你的！
    // 使用 http://localhost:8080/form.jsp (刚刚写的提交表单) 会自动跳转到 http://localhost:8080/add/1/3！（也就是服务器以POST方式发送数据给用户了）
    @PostMapping(value = "/add/{l}/{r}")
    // 一定别忘了加 @PathVariable 注解！！！！
    public String demoFESTFul04(Model model, @PathVariable int l, @PathVariable int r) {
        int result = l + r;
        model.addAttribute("msg", "使用了 @PostMapping，结果为：" + result);
        return "test";
    }
}

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/24 22:52
 * @Author : NekoSilverfox
 * @FileName: User
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 需要导入 lombok 包
@Data  // @Data 相当于给所有变量设置了set get 方法 和toString
@AllArgsConstructor  // 增加构造
@NoArgsConstructor  // 增加构造
public class User {
    private int id;
    private String name;
    private int age;
}

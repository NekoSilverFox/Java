package com.foxthere;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/6 19:11
 * @Author : NekoSilverfox
 * @FileName: com.foxthere.Demo01Reflection
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 625 - 反射_简单使用
public class Demo01Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        // 通过反射获取类的class对象
        Class c1 = Class.forName("com.foxthere.User");
        System.out.println(c1);  // class com.foxthere.User

        // 一个类在内存区只有一个Class对象
        // 【重点】一个类被加载之后，类的整个结构都会被封装在Class对象中！
        Class c2 = Class.forName("com.foxthere.User");
        Class c3 = Class.forName("com.foxthere.User");
        Class c4 = Class.forName("com.foxthere.User");
        System.out.println(c2.hashCode());  // 1355531311
        System.out.println(c3.hashCode());  // 1355531311
        System.out.println(c4.hashCode());  // 1355531311
    }
}

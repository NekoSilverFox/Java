/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/4 10:09
 * @Author : NekoSilverfox
 * @FileName: Person
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;


public class Person {

    /* @Resource 是 Java 自带的一种方法，但是没有 @Autowired 和 @Qualifier 高级（效率低了那么一丢丢）
    @Resource
    private Cat cat;

    @Resource(name = "cat111")
    private Cat cat;
    */


    @Autowired(required = false)  // 【重点】如果定义了Autowired的required属性为false，说明这个对象可以为null，否则不允许为空
    private Cat cat;

    @Autowired
    @Qualifier(value = "dog222")  // 【重点】如果自动装配的环境比较复杂，那么可以使用 @Qualifier(value = "") 配合 @Autowired 的使用指定唯一的Bean对象注入
    private Dog dog;

    private String name;


    // 【重点】 标记了 @Nullable 这个注解，说明这个字段可以为null
    public Person(@Nullable String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }

    public Dog getDog() {
        return dog;
    }

//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

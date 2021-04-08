/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/8 20:49
 * @Author : NekoSilverfox
 * @FileName: Person
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.lang.reflect.Field;
import java.util.Date;

public class Person {
    private String name;
    private int age;
    private String sex;

//    @JsonIgnore  忽略该属性
    @JsonFormat(pattern = "yyyy-MM-dd")  // 格式化对象
    private Date birthday;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

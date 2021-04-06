package com.foxthere;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/6 19:23
 * @Author : NekoSilverfox
 * @FileName: Demo02MethodGetReflectionClass
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

// 测试 Class 类的创建方式有哪些
public class Demo02MethodGetReflectionClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("我是" + person.name);

        // 方法一：通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        // 方法二： forName获得
        Class c2 = Class.forName("com.foxthere.Student");
        System.out.println(c2.hashCode());

        // 方法三：通过 类名.class 获得
        Class<Student> c3 = Student.class;
        System.out.println(c3.hashCode());

        // 方法四：基本内置类型的包装类都有一个Type属性
        Class<Integer> c4 = Integer.TYPE;
        System.out.println(c4.hashCode());

        // 获得父类的类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5);  // class com.foxthere.Person
    }
}

class Person {
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person {

    public Student() {
        this.name = "学生";
    }
}

class Teacher extends Person {
    public Teacher() {
        this.name = "老师";
    }
}

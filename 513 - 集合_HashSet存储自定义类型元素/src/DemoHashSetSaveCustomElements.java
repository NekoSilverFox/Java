import java.util.HashSet;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/16 16:51
 * @Author : NekoSilverfox
 * @FileName: DemoHashSetSaveCustomElements
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoHashSetSaveCustomElements {
    /*
    HashSet存储自定义类型元素

    set集合报错元素唯一:
        存储的元素(String,Integer,...Student,Person...),必须重写hashCode方法和equals方法

    要求:
        同名同年龄的人,视为同一个人,只能存储一次
 */
    public static void main(String[] args) {
        Person p1 = new Person("SilverFox", 16);
        System.out.println(p1.hashCode());

        Person p2 = new Person("Fox", 17);
        System.out.println(p2.hashCode());

        Person p3 = new Person("Fox", 17);
        System.out.println(p3.hashCode());

        System.out.println(p2 == p3);  // false - new 出来的两个地址不同
        System.out.println(p2.equals(p3));  // false - 不重写比较的是两个地址值

        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}

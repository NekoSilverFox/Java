import java.util.ArrayList;
import java.util.Collections;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/16 18:45
 * @Author : NekoSilverfox
 * @FileName: DemoCollectionsSort
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

/*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。

    注意:
         sort(List<T> list)使用前提
         【重点】被排序的集合里边存储的元素,必须实现Comparable, 【重写接口】中的方法compareTo定义排序的规则

    Comparable接口的排序规则:
        自己(this)-参数: 升序
 */

public class DemoCollectionsSort_Comparable {
    public static void main(String[] args) {
        Person p1 = new Person("Fox", 17);
        Person p2 = new Person("SilverFox", 16);
        Person p3 = new Person("Yiff", 19);

        ArrayList<Person> person_list = new ArrayList<>();
        Collections.addAll(person_list, p1, p2, p3);
        System.out.println(person_list);  // [Person{name='Fox', age=17}, Person{name='SilverFox', age=16}, Person{name='Yiff', age=19}]

        Collections.sort(person_list);
        System.out.println(person_list);  // [Person{name='Yiff', age=19}, Person{name='Fox', age=17}, Person{name='SilverFox', age=16}]

    }
}

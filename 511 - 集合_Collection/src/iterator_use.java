/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/14 21:02
 * @Author : NekoSilverfox
 * @FileName: iterator_use
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

        /*
    java.util.Iterator接口:迭代器(对集合进行遍历)
    有两个常用的方法
        boolean hasNext() 如果仍有元素可以迭代，则返回 true。
            判断集合中还有没有下一个元素,有就返回true,没有就返回false
        E next() 返回迭代的下一个元素。
            取出集合中的下一个元素
    Iterator迭代器,是一个接口,我们无法直接使用,需要使用Iterator接口的实现类对象,获取实现类的方式比较特殊
    Collection接口中有一个方法,叫iterator(),这个方法返回的就是迭代器的实现类对象
        Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器。

    迭代器的使用步骤(重点):
        1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
        2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
        3.使用Iterator接口中的方法next取出集合中的下一个元素
 */

public class iterator_use {
    public static void main(String[] args) {
        Collection<String> coll_str = new ArrayList<>();
        coll_str.add("Silverfox");
        coll_str.add("Fox");
        coll_str.add("Yiff");
        coll_str.add("Nick");
        coll_str.add("Wilde");

        /*
            1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
            注意:
                Iterator<E>接口也是有泛型的,迭代器的泛型跟着集合走,集合是什么泛型,迭代器就是什么泛型
         */
        //多态      接口            实现类对象
        Iterator<String> it = coll_str.iterator();

        boolean is_em = it.hasNext();  // 【重点】 如果指针指向处有元素就会返回一个true
        System.out.println(is_em);  // true
        String str = it.next();  // 【重点】 获取元素，并将指针移动一位
        System.out.println(str);  // Silverfox


        // 使用while循环遍历
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("---------------------------");

        // 使用 for 遍历
        for (Iterator<String> it2 = coll_str.iterator(); it2.hasNext(); ) {
            System.out.println(it2.next());
        }




    }
}

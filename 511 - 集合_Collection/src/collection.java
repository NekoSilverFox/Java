import java.util.ArrayList;
import java.util.Collection;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/14 19:30
 * @Author : NekoSilverfox
 * @FileName: collection
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 511 - 集合_Collection

    /*
    java.util.Collection接口
        所有单列集合的最顶层的接口,里边定义了所有单列集合共性的方法
        任意的单列集合都可以使用Collection接口中的方法


    共性的方法:
      public boolean add(E e)：  把给定的对象添加到当前集合中 。
      public boolean remove(E e): 把给定的对象在当前集合中删除。
      public boolean contains(E e): 判断当前集合中是否包含给定的对象。
      public boolean isEmpty(): 判断当前集合是否为空。
      public int size(): 返回集合中元素的个数。
      public Object[] toArray(): 把集合中的元素，存储到数组中。
      public void clear() :清空集合中所有的元素。
 */


public class collection {
    public static void main(String[] args) {
        // 创建对象
        // 注意 Collection<> 是一个根集合，是一个接口！
        Collection<String> coll = new ArrayList<>();  // 注意，这里new的对象

        // boolean add(E e)：  把给定的对象添加到当前集合中 。
        coll.add("Hello");
        coll.add("World");
        coll.add("Java");
        System.out.println(coll);  // [Hello, World, Java]

        // boolean remove(E e): 把给定的对象在当前集合中删除
        coll.remove("Java");
        System.out.println(coll);  // [Hello, World]

        // boolean contains(E e): 判断当前集合中是否包含给定的对象。
        System.out.println(coll.contains("Java"));  // false
        System.out.println(coll.contains("Hello"));  // true

        // boolean isEmpty(): 判断当前集合是否为空。
        System.out.println(coll.isEmpty());  // false

        // int size(): 返回集合中元素的个数。
        System.out.println(coll.size());  // 2

        // Object[] toArray(): 把集合中的元素，存储到数组中。
        Object[] arr_str = coll.toArray();
//        System.out.println(arr_str.toString());
        for (int i  = 0; i < arr_str.length; i++) {
            System.out.print(arr_str[i] + " ");
        }

        // void clear() :清空集合中所有的元素。
        coll.clear();
        System.out.println(coll.isEmpty());  // true
    }

}

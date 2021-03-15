import java.util.LinkedList;
import java.util.List;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/15 21:18
 * @Author : NekoSilverfox
 * @FileName: DemoList
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 505 - 集合_List
/*
    java.util.List接口 extends Collection接口
    List接口的特点:
        1.有序的集合,存储元素和取出元素的顺序是一致的(存储123 取出123)
        2.有索引,包含了一些带索引的方法
        3.允许存储重复的元素

    List接口中带索引的方法(特有)
        - public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
        - public E get(int index):返回集合中指定位置的元素。
        - public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        - public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值是更新前的元素。
    注意:
        操作索引的时候,一定要防止索引越界异常
        IndexOutOfBoundsException:索引越界异常,集合会报
        ArrayIndexOutOfBoundsException:数组索引越界异常
        StringIndexOutOfBoundsException:字符串索引越界异常
 */
public class DemoList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        // public void add(int index, E element): 将指定的元素，添加到该集合中的【指定位置】上。
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add(2, "JAVA");
        System.out.println(list);

        // public E get(int index):返回集合中指定位置的元素。
        System.out.println(list.get(1));

        // public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        System.out.println("删除了：" + list.remove(1));
        System.out.println("删除后：" + list);

        // public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值是更新前的元素。
        System.out.println("替换了：" + list.set(2, "Yiff"));
        System.out.println("替换后：" + list);

    }
}

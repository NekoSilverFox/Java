import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/15 23:37
 * @Author : NekoSilverfox
 * @FileName: DemoHashSet
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    java.util.Set接口 extends Collection接口
    Set接口的特点:
        1.不允许存储重复的元素
        2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
    java.util.HashSet集合 implements Set接口
    HashSet特点:
         1.不允许存储重复的元素
         2.没有索引,没有带索引的方法,也不能使用[普通]的for循环遍历，可以使用迭代器for 【重点】
         3.是一个无序的集合,存储元素和取出元素的顺序有可能不一致
         4.底层是一个哈希表结构(查询的速度非常的快)
 */
public class DemoHashSet {
    public static void main(String[] args) {
        Set<Integer> hash_set = new HashSet<>();

        hash_set.add(3);
        hash_set.add(1);
        hash_set.add(2);

        // 使用迭代器遍历
        Iterator<Integer> it = hash_set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");  // 1 2 3
        }

        //使用增强for遍历set集合
        for (Integer i : hash_set) {
            System.out.print(i + " ");  // 1 2 3
        }
    }
}

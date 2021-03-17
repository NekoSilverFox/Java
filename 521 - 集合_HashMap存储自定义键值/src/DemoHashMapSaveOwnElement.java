import java.util.*;
import java.util.logging.Handler;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/17 18:39
 * @Author : NekoSilverfox
 * @FileName: DemoHashMapSaveOwnElement
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的:
        作为key的元素,必须重写hashCode方法和equals方法,以保证key唯一

        HashMap存储自定义类型键值
        key:Person类型
            【重点】如果自定义类作为key，那么就必须重写hashCode方法和equals方法,以保证key唯一
        value:String类型
            可以重复
*/
public class DemoHashMapSaveOwnElement {
    public static void main(String[] args) {
        Person p1 = new Person("Fox", 17);
        Person p2 = new Person("SilverFox", 16);
        Person p3 = new Person("RedFox", 18);
        Person p4 = new Person("RedFox", 18);

        HashMap<Person, Integer> person_map = new HashMap<>();
        person_map.put(p1, 5);
        person_map.put(p3, 7);
        person_map.put(p2, 6);
        person_map.put(p4, 3);

        Set<Map.Entry<Person, Integer>> entry_set = person_map.entrySet();
        for (Map.Entry<Person, Integer> entry : entry_set) {
            Person key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "<---->" + value);
        }

    }
}

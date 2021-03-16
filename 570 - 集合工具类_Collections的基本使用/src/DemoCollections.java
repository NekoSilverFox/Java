import java.util.ArrayList;
import java.util.Collections;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/16 18:36
 * @Author : NekoSilverfox
 * @FileName: DemoCollections
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    - java.utils.Collections是【集合工具类】，用来对集合进行操作。部分方法如下：
        - public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
        - public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
        - public static <T> void sort(List<T> list):将集合中元素按照【默认规则】排序。
 */
public class DemoCollections {
    public static void main(String[] args) {
        ArrayList<Integer> arr_list = new ArrayList<>();

        // public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
        Collections.addAll(arr_list, 1, 3, 4, 2);
        System.out.println(arr_list);  // [1, 3, 4, 2]

        // public static <T> void sort(List<T> list):将集合中元素按照【默认规则】排序
        Collections.sort(arr_list);
        System.out.println(arr_list);  // [1, 2, 3, 4] 默认是升序

        // public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序
        Collections.shuffle(arr_list);
        System.out.println(arr_list);  // [4, 2, 1, 3]
    }
}

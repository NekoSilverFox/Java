import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 21:53
 * @Author : NekoSilverfox
 * @FileName: Demo06Stream_count
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    Stream流中的常用方法_count:用于统计Stream流中元素的个数
    long count();
    【重点】count方法是一个终结方法,返回值是一个long类型的整数
    所以不能再继续调用Stream流中的其他方法了
 */
public class Demo06Stream_count {
    public static void main(String[] args) {
        //获取一个Stream流
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);  // 7
    }
}

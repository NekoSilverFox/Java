import java.util.ArrayList;
import java.util.List;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 20:24
 * @Author : NekoSilverfox
 * @FileName: Demo02UseStream
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    使用Stream流的方式,遍历集合,对集合中的数据进行过滤
    Stream流是JDK1.8之后出现的
    关注的是做什么,而不是怎么做
 */
public class Demo02UseStream {
    public static void main(String[] args) {
        //创建一个List集合,存储姓名
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        // 对list集合中的元素进行过滤,只要以张开头的元素,存储到一个新的集合中
        // 对listA集合进行过滤,只要姓名长度为3的人,存储到一个新集合中
        // 遍历结果
        list.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));

    }
}

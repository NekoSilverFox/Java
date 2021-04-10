import java.util.ArrayList;
import java.util.List;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 20:09
 * @Author : NekoSilverfox
 * @FileName: Demo01UseList
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
//
public class Demo01UseList {
    public static void main(String[] args) {
        /*
    使用传统的方式,遍历集合,对集合中的数据进行过滤
         */
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        // 对list集合中的元素进行过滤,只要以 张 开头的元素,存储到一个新的集合中
        ArrayList<String> tmp = new ArrayList<>();
        for (String str : list) {
            if (str.startsWith("张")) {
                tmp.add(str);
            }
        }

        // 对listA集合进行过滤,只要姓名长度为3的人,存储到一个新集合中
        ArrayList<String> result = new ArrayList<>();
        for (String str : tmp) {
            if (str.length() == 3) {
                result.add(str);
            }
        }


        for (String str : result) {
            System.out.println(str);
        }


        // 对listA集合进行过滤,只要姓名长度为3的人,存储到一个新集合中
    }
}

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 19:01
 * @Author : NekoSilverfox
 * @FileName: Task05Predicate
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    练习：集合信息筛选
    数组当中有多条“姓名+性别”的信息如下，
    String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
    请通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中，
    需要同时满足两个条件：
        1. 必须为女生；
        2. 姓名为4个字。

    分析:
        1.有两个判断条件,所以需要使用两个Predicate接口,对条件进行判断
        2.必须同时满足两个条件,所以可以使用and方法连接两个判断条件
 */
public class Task05Predicate {
    public static ArrayList<String> filter(String[] arrStr, Predicate<String> pre1, Predicate<String> pre2) {
        // 定义一个ArrayList集合,存储过滤之后的信息
        ArrayList<String> arrList = new ArrayList<>();

        for (String str : arrStr) {
            // 使用Predicate接口中的方法test对获取到的字符串进行判断
            if (pre1.and(pre2).test(str)) {
                arrList.add(str);
            }
        }

        return arrList;
    }


    public static void main(String[] args) {
        //定义一个储存字符串的数组
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };

        //调用filter方法,传递字符串数组和两个Lambda表达式
        ArrayList<String> resultList = filter(array,
                (String str) -> {
//                    return str.split(",")[1] == "女"; 【重点】错误写法！
                    return str.split(",")[1].equals("女");
                },
                (String str) -> {
//                    return str.length() == 4; 写错了！！！！
                    return str.split(",")[0].length() == 4;
                });

        for (String str : resultList) {
            System.out.println(str);
        }

    }
}

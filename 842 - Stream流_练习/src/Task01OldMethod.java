import java.util.ArrayList;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 22:13
 * @Author : NekoSilverfox
 * @FileName: Task01OldMethod
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    练习:集合元素处理（传统方式）
        现在有两个ArrayList集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）依次进行以下若干操作步骤：
        1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
        2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中。
        3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中。
        4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中。
        5. 将两个队伍合并为一个队伍；存储到一个新集合中。
        6. 根据姓名创建Person对象；存储到一个新集合中。
        7. 打印整个队伍的Person对象信息。
 */
public class Task01OldMethod {
    public static void main(String[] args) {
        //第一支队伍
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");

        // 1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
        ArrayList<String> res1_1 = new ArrayList<>();
        for (String s : one) {
            if (s.length() == 3) {
                res1_1.add(s);
            }
        }


        // 2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中。
        ArrayList<String> res1_2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            res1_2.add(res1_1.get(i));
        }

        //第二支队伍
        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");

        // 3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中。
        ArrayList<String> res2_1 = new ArrayList<>();
        for (String s : two) {
            if (s.startsWith("张")) {
                res2_1.add(s);
            }
        }

        // 4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中。
        ArrayList<String> res2_2 = new ArrayList<>();
        for (int i = 2; i < res2_1.size(); i++) {
            res2_2.add(res2_1.get(i));
        }

        // 5. 将两个队伍合并为一个队伍；存储到一个新集合中。
        ArrayList<String> res = new ArrayList<>();
        res.addAll(res1_2);
        res.addAll(res2_2);


        // 6. 根据姓名创建Person对象；存储到一个新集合中。
        ArrayList<Person> personArrayList = new ArrayList<>();
        for (String s : res) {
            personArrayList.add(new Person(s));
        }

        // 7. 打印整个队伍的Person对象信息。
        for (Person person : personArrayList) {
            System.out.println(person);
        }
    }
}

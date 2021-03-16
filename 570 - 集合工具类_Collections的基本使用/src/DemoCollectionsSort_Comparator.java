import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/16 20:03
 * @Author : NekoSilverfox
 * @FileName: DemoCollectionsSort_Comparator
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。

     Comparator和Comparable的区别：【重点】
        Comparable:自己(this)和别人(参数)比较,【自己需要实现】Comparable接口,【重写】比较的规则compareTo方法
        Comparator:相当于找一个第三方的裁判,比较两个

    Comparator的排序规则:
        o1-o2:升序
 */
public class DemoCollectionsSort_Comparator {
    public static void main(String[] args) {
        ArrayList<Integer> arr_int = new ArrayList<>();
        Collections.addAll(arr_int, 4, 1, 3, 2);
        System.out.println("Before sort: " + arr_int);

        Collections.sort(arr_int, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return 0; 代表所有元素相同
//                return o1 - o2;  // 升序
                return o2 - o1;  // 降序
            }
        });
        System.out.println("After sort: " + arr_int);


        ArrayList<Students> arr_stu = new ArrayList<>();
        Collections.addAll(arr_stu,
                new Students("Fox", 13),
                new Students("SilverFox", 17),
                new Students("Nick", 12));
        System.out.println("Before sort: " + arr_stu);
//        Collections.sort(arr_stu, new Comparator<Students>() {
//            @Override
//            public int compare(Students o1, Students o2) {
//                // 按照年龄升序排序
//                return o1.getAge() - o2.getAge();
//            }
//        });
        Collections.sort(arr_stu, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                // 如果两个人年龄相同,再使用姓名的第一个字比较
                int result = o1.getAge() - o2.getAge();
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });

        System.out.println("After sort: " + arr_stu);
    }
}

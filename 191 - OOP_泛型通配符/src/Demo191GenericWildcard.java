import java.util.ArrayList;
import java.util.Iterator;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/15 18:12
 * @Author : NekoSilverfox
 * @FileName: Demo191GenericWildcard
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

/*
    泛型的通配符:
        ?:代表任意的数据类型
    使用方式: 【重点】
        不能创建对象使用
        【只能作为方法的参数使用】
 */

public class Demo191GenericWildcard {
    public static void main(String[] args) {
        ArrayList<Integer> arr_int = new ArrayList<>();
        arr_int.add(1);
        arr_int.add(2);
        arr_int.add(3);

        ArrayList<String> arr_str = new ArrayList<>();
        arr_str.add("a");
        arr_str.add("b");
        arr_str.add("c");

        print(arr_int);
        print(arr_str);
    }

    /*
    定义一个方法,能遍历所有类型的ArrayList集合
    这时候我们不知道ArrayList集合使用什么数据类型,可以泛型的通配符?来接收数据类型
    注意:
        泛型没有继承概念的
     */
    public static void print(ArrayList<?> arr) {
        // 使用迭代器遍历
        Iterator<?> it = arr.iterator();

        while (it.hasNext()) {
            // it.next(), 方法取出的是Object，可以接受任意数据类型
            Object o = it.next();
            System.out.println(o);
        }

    }
}

import java.lang.annotation.ElementType;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/6 19:44
 * @Author : NekoSilverfox
 * @FileName: Demo627Reflection
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 627 - 反射_所有类型的Class对象
public class Demo627Reflection {
    public static void main(String[] args) {
        Class c1 = Integer.class;  // 基本数据类型
        Class c2 = void.class;  // void
        Class c3 = Object.class;  // 类
        Class c4 = Comparable.class;  // 接口
        Class c5 = String[].class;  // 一维数组
        Class c6 = int[][].class;  // 二维数组
        Class c7 = Override.class;  // 注解
        Class c8 = ElementType.class;  // 枚举
        Class c9 = Class.class;  // Class

        System.out.println(c1);  // class java.lang.Integer
        System.out.println(c2);  // void
        System.out.println(c3);  // class java.lang.Object
        System.out.println(c4);  // interface java.lang.Comparable
        System.out.println(c5);  // class [Ljava.lang.String;
        System.out.println(c6);  // class [[I
        System.out.println(c7);  // interface java.lang.Override
        System.out.println(c8);  // class java.lang.annotation.ElementType
        System.out.println(c9);  // class java.lang.Class

        System.out.println("=====================");

        // 【重点】只要元素类型与维度一样，就是同一个Class
        int [] arr1 = new int[10];
        int [] arr2 = new int[100];
        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());
    }
}

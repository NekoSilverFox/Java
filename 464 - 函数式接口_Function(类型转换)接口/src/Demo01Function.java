import java.util.function.Function;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 19:30
 * @Author : NekoSilverfox
 * @FileName: Demo01Function
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 464 - 函数式接口_Function(类型转换)接口
/*
    java.util.function.Function<T,R>接口用来根据一个类型的数据得到另一个类型的数据，
        前者称为前置条件，后者称为后置条件。
    Function接口中最主要的抽象方法为：R apply(T t)，根据类型T的参数获取类型R的结果。
        使用的场景例如：将String类型转换为Integer类型。
 */
public class Demo01Function {
    /*
        定义一个方法
        方法的参数传递一个字符串类型的整数
        方法的参数传递一个Function接口,泛型使用<String,Integer>
        使用Function接口中的方法apply,把字符串类型的整数,转换为Integer类型的整数
     */
    public static void toInt(String str, Function<String, Integer> function) {
        int num = function.apply(str);  // 自动拆箱 Integer->int
        System.out.println(num);
    }

    public static void main(String[] args) {
        String str = "2345";

        toInt(str, s -> Integer.parseInt(s));  //把字符串类型的整数,转换为Integer类型的整数返回
    }
}

import java.util.function.Predicate;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 18:43
 * @Author : NekoSilverfox
 * @FileName: Demo01Predicate
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 463 - 函数式接口_Predicate接口
/*
    java.util.function. <T>接口
    作用:对某种数据类型的数据进行判断,结果返回一个boolean值

    Predicate接口中包含一个抽象方法：
        boolean test(T t):用来对指定数据类型数据进行判断的方法
            结果:
                符合条件,返回true
                不符合条件,返回false
*/
public class Demo01Predicate {
    /*
        定义一个方法
        参数传递一个String类型的字符串
        传递一个Predicate接口,泛型使用String
        使用Predicate中的方法test对字符串进行判断,并把判断的结果返回
     */
    public static boolean checkString(String str, Predicate<String> pre) {
        return pre.test(str);
    }

    public static void main(String[] args) {

        String str = "Silverfox";

        // 调用checkString方法对字符串进行校验,参数传递字符串和Lambda表达式
        boolean b = checkString(str, s -> s.length() > 5);
        System.out.println(b);
    }
}

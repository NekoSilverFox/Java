/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 23:54
 * @Author : NekoSilverfox
 * @FileName: Demo01StaticMethodReference
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 482 - 方法引用_通过类象名引用静态成员方法
/*
    通过类名引用静态成员方法
    类已经存在,静态成员方法也已经存在
    就可以通过类名直接引用静态成员方法
 */
public class Demo01StaticMethodReference {
    // 定义一个方法,方法的参数传递要计算绝对值的整数,和函数式接口 Calcable
    public static int method(int num, Calcable calcable) {
        return calcable.calAbs(num);
    }

    public static void main(String[] args) {
        // 调用method方法,传递计算绝对值得整数,和Lambda表达式
        int i = method(-233, num -> {
            return Math.abs(num);
        });
        System.out.println(i);

        /*
            使用方法引用优化Lambda表达式
            Math类是存在的
            abs计算绝对值的静态方法也是已经存在的
            所以我们可以直接通过类名引用静态方法
         */
        i = method(-322, Math::abs);
        System.out.println(i);
    }
}

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/14 23:50
 * @Author : NekoSilverfox
 * @FileName: GenericMethod
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 *
 * 含有泛型的方法
 */

/*
    定义含有泛型的方法:泛型定义在方法的修饰符和返回值类型之间

    格式:
        修饰符 <泛型> 返回值类型 方法名(参数列表(使用泛型)){
            方法体;
        }

    含有泛型的方法,在调用方法的时候确定泛型的数据类型
    传递什么类型的参数,泛型就是什么类型
 */

public class GenericMethod {
    // 定义一个含有泛型的方法
    public <M> void printValue(M value) {
        System.out.println(value);
    }

    // 定义一个含有泛型的静态方法
    public static <M> void staticPrintValue(M value) {
        System.out.println(value);
    }
}

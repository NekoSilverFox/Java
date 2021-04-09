/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/9 20:05
 * @Author : NekoSilverfox
 * @FileName: Demo01Logger
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 456 - 函数式接口_日志案例
/*
    日志案例

    发现以下代码存在的一些性能浪费的问题
    调用showLog方法,传递的第二个参数是一个拼接后的字符串
    先把字符串拼接好,然后在调用showLog方法
    showLog方法中如果传递的日志等级不是1级
    那么就不会是如此拼接后的字符串
    所以感觉字符串就白拼接了,存在了浪费
 */
public class Demo01Logger {
    // 定义一个根据日志的级别,显示日志信息的方法
    public static void showLogger(int level, String msg) {
        // 对日志的等级进行判断,如果是1级别,那么输出日志信息
        if (level == 1) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        // 定义三个日志信息
        String msg1 = "Hello";
        String msg2 = " World ";
        String msg3 = "Java";

        // 调用showLog方法,传递日志级别和日志信息
        // 【重点】这里有一个问题，如果日志的等级不是1，拼接语句也会被执行，造成了资源的浪费
        showLogger(1, msg1 + msg2 + msg3);
    }
}

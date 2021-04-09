/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/9 20:17
 * @Author : NekoSilverfox
 * @FileName: Demo01Runnable
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 458 - 函数式接口_函数式接口作为方法的返回值
/*
    例如java.lang.Runnable接口就是一个函数式接口，
    假设有一个startThread方法使用该接口作为参数，那么就可以使用Lambda进行传参。
    这种情况其实和Thread类的构造方法参数为Runnable没有本质区别。
 */
public class Demo01Runnable {
    // 定义一个方法startThread,方法的参数使用函数式接口Runnable
    public static void startThread(Runnable runnable) {
        // 开启多线程
        new Thread(runnable).run();
    }

    public static void main(String[] args) {
        // 调用startThread方法,方法的参数是一个接口,那么我们可以传递这个接口的匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "--> 线程启动了");
            }
        });

        // 调用startThread方法,方法的参数是一个函数式接口,所以可以传递Lambda表达式
        startThread(() -> {
            System.out.println(Thread.currentThread().getName() + "--> 线程启动了");
        });

        // 优化Lambda表达式
        startThread(() -> System.out.println(Thread.currentThread().getName() + "--> 线程启动了"));
    }
}

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/25 0:42
 * @Author : NekoSilverfox
 * @FileName: DemoErrorThread
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

/**
    模拟卖票案例
    创建3个线程,同时开启,对共享的票进行出售
 */

public class DemoErrorThread {
    public static void main(String[] args) {
        // 创建Runnable接口的实现类对象
        RunnableImpl run_ticket = new RunnableImpl();

        // 创建Thread类对象,构造方法中传递Runnable接口的实现类对象
        Thread t1 = new Thread(run_ticket);
        Thread t2 = new Thread(run_ticket);
        Thread t3 = new Thread(run_ticket);

        // 调用start方法开启多线程
        t1.start();
        t2.start();
        t3.start();
    }
}

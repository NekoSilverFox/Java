/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/25 19:36
 * @Author : NekoSilverfox
 * @FileName: DemoLock
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 360 - 多线程_Lock锁接口（实现类：ReentrantLock）
 */

public class DemoLock {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        System.out.println("main-> " + runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);

        t1.start();
        t2.start();
        t3.start();
    }
}

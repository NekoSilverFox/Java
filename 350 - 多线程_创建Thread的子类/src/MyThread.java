/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/24 21:21
 * @Author : NekoSilverfox
 * @FileName: MyThread
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            /** 获取线程名称
             * 方法一：
             *      在内部使用 getname()
             *      主线程名称：main
             *      新线程：Thread-0、Thread-1、Thread-2
             *
             * 方法二：
             *      【静态方法】
             *      Thread.currentThread()
             *      或者
             *      Thread.currentThread().getname()
             * */
            String name_thread = getName();
            System.out.println("Run:" + i + " " + name_thread);

            System.out.println(Thread.currentThread());  // Thread[Thread-1,5,main]
        }
    }
}

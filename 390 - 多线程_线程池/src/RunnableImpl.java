/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/26 15:50
 * @Author : NekoSilverfox
 * @FileName: RunnableImpl
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 线程正在执行");
    }
}

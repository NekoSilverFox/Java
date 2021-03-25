/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/25 14:30
 * @Author : NekoSilverfox
 * @FileName: RunnableImpl
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的一种方案:使用同步代码块
    格式:
        synchronized(锁对象){
            可能会出现线程安全问题的代码(访问了共享数据的代码)
        }

    注意:
        1.通过代码块中的锁对象,可以使用任意的对象
        2.但是必须保证多个线程使用的锁对象是同一个
        3.锁对象作用:
            把同步代码块锁住,只让一个线程在同步代码块中执行
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;

    // 在外部创建一个锁对象
    Object lockObj = new Object();

    @Override
    public void run() {
        while (true) {

            // 同步代码快
            synchronized (lockObj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " 正在卖第 " + ticket-- + " 张票");
                }
            }
        }
    }
}

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/25 23:39
 * @Author : NekoSilverfox
 * @FileName: ChiHuo
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    消费者（吃货）类：是一个线程类，继承Thread
    设置线程任务（run）：吃包子
    对包子的状态进行判断
    flase：没有包子
        调用wait进入等待状态
    true：有包子
        吃货吃包子
        吃货吃完包子
        修改包子的状态为false
        吃货唤醒包子线程，生产包子
 */
public class ChiHuo extends Thread { // 【重点】要记得继承线程类
    // 1. 设置包子变量（也作为线程锁使用）
    private BaoZi bz;

    // 2. 使用带参构造，为这个包子的变量赋值
    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    // 设置线程任务（run）：吃包子
    @Override
    public void run() {

        while (true) {  // 经测试，while死循环放在 synchronized上下都行。但是放在上边比较好（我觉得）
            // 【重点】必须使用同步技术来保证只有一个线程在执行
            synchronized (bz) {
                if (bz.flag == false) {
                    try {
                        System.out.println("消费者：我在等着吃包子惹");
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("消费者：干饭人，开吃 " + bz.pi + bz.xian + " 的包子！");
                    bz.flag = false;
                    System.out.println("消费者：干饭人，吃完了 " + bz.pi + bz.xian + " 的包子！");

                    System.out.println("消费者：老板我吃完了，再来俩");
                    bz.notify();

                    System.out.println("======================================================");
                }
            }
        }
    }
}

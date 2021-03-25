/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/25 20:44
 * @Author : NekoSilverfox
 * @FileName: DemoWaitAndNotify
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 380 - 多线程_线程通信_等待唤醒案例（生产者消费者问题）
 */
/*
    进入到TimeWaiting(计时等待)有两种方式
    1.使用sleep(long m)方法,在毫秒值结束之后,线程睡醒进入到Runnable/Blocked状态
    2.使用wait(long m)方法,wait方法如果在毫秒值结束之后,还没有被notify唤醒,就会自动醒来,线程睡醒进入到Runnable/Blocked状态

    唤醒的方法:
         void notify() 唤醒在此对象监视器上等待的单个线程。
         void notifyAll() 唤醒在此对象监视器上等待的所有线程。
 */
public class DemoWaitAndNotifyAll {
    public static void main(String[] args) {
        // 【重点】创见美锁对象，保证唯一
        Object lockObj = new Object();

        // 创建一个顾客线程(消费者)
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 一直等着买火烧
                while (true) {
                    // 保证等待和唤醒的线程只能有一个执行,需要使用同步技术
                    synchronized (lockObj) {
                        System.out.println("消费者1：老板，我要吃火烧 qwq");
                        // 调用wait方法,放弃cpu的执行,进入到WAITING状态(无限等待)
                        try {
                            lockObj.wait(5000);  // 【注意】：这里的是有参的wait方法，毫秒值结束之后,还没有被notify唤醒，将自动苏醒
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后
                        System.out.println("消费者1：谢谢老板，火烧真好吃 uwu");
                        System.out.println("================");
                    }
                }
            }
        }).start();

        // 创建一个顾客线程(消费者)
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 一直等着买火烧
                while (true) {
                    // 保证等待和唤醒的线程只能有一个执行,需要使用同步技术
                    synchronized (lockObj) {
                        System.out.println("消费者2：老板，我要吃火烧 qwq");
                        // 调用wait方法,放弃cpu的执行,进入到WAITING状态(无限等待)
                        try {
                            lockObj.wait(5000);  // 注意：这里的是有参的wait方法，如果5秒过后没有被唤醒将自动苏醒
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后
                        System.out.println("消费者2：谢谢老板，火烧真好吃 uwu");
                        System.out.println("================");
                    }
                }
            }
        }).start();

        // 创建一个老板线程(生产者)
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 一直做火烧
                while (true) {
                    try {
                        // 3秒中做火烧
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // 保证等待和唤醒的线程只能有一个执行,需要使用同步技术
                    synchronized (lockObj) {
                        System.out.println("老板：火烧做好了，咪惹");

                        // 【重点】做好包子之后,调用notify方法,唤醒顾客吃包子
                        // 唤醒了线程
//                        lockObj.notify(); // 如果有多个等待线程,随机唤醒一个
                        lockObj.notifyAll();  // 唤醒所有等待的线程
                    }
                }
            }
        }).start();
    }
}

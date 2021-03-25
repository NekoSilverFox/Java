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
    等待唤醒案例:线程之间的通信
        创建一个顾客线程(消费者):告知老板要的包子的种类和数量,调用wait方法,放弃cpu的执行,进入到WAITING状态(无限等待)
        创建一个老板线程(生产者):花了5秒做包子,做好包子之后,调用notify方法,唤醒顾客吃包子

    注意:
        顾客和老板线程必须使用同步代码块包裹起来,保证等待和唤醒只能有一个在执行
        同步使用的锁对象必须保证唯一
        只有锁对象才能调用wait和notify方法

    Obejct类中的方法
    void wait()
          在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
    void notify()
          唤醒在此对象监视器上等待的单个线程。
          会继续执行wait方法之后的代码
 */
public class DemoWaitAndNotify {
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
                        System.out.println("消费者：老板，我要吃火烧 qwq");
                        // 调用wait方法,放弃cpu的执行,进入到WAITING状态(无限等待)
                        try {
                            lockObj.wait();  // 注意：这里的是无参的wait方法
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后
                        System.out.println("消费者：谢谢老板，火烧真好吃 uwu");
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
                        lockObj.notify(); // 【重点】如果有多个等待线程,随机唤醒一个
                    }
                }
            }
        }).start();
    }
}

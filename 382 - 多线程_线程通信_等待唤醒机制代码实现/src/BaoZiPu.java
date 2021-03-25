/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/25 23:51
 * @Author : NekoSilverfox
 * @FileName: BaoZiPu
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 *
 *  生产者（包子铺）：是一个线程类，继承Thread
 *  设置线程任务：生产包子
 *  对包子的有无状态进行判断
 *  true：有包子
 *      包子铺调用wait进入等待
 *  false：没有包子
 *      包子铺生产包子
 *      增加一些趣味性：交替生产两种包子
 *           两种状态：（i % 2 == 0）【重点】学习有几种状态的思想，和扑克牌案例一样
 *        包子铺生产好了包子
 *        修改包子的状态为true
 *        唤醒吃货线程，让吃货线程吃包子
 *
 *   注意：
 *      包子铺和包子的关系 ===》通信（互斥）
 *      必须使用同步技术保证两个线程只有一个在执行
 *      锁对象必须保证唯一，就可以使用包子对象作为锁对象
 *      包子铺和吃货的类就需要把包子对象作为参数传递进来
 *          1. 需要在成员位置创建一个包子对象
 *          2. 使用带参构造方法，为这个包子变量赋值
 */

public class BaoZiPu extends Thread{
    private BaoZi bz;
    private int count_bz = 0;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    // 设置线程任务（run）
    @Override
    public void run() {
        // 让包子铺一只生产包子
        while (true){
            // 必须使用同时同步技术保证两个线程只有一个在执行
            synchronized (bz) {

                // 包子铺调用wait进入等待
                if (bz.flag == true) {
                    System.out.println("老板：有现成的包子，等你吃完");
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 被唤醒之后，包子铺开始生产
                System.out.println("老板：开始做包子了");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (count_bz % 2 == 0) {
                    bz.pi = "烫面";
                    bz.xian = "肉三鲜";
                } else {
                    bz.pi = "发面";
                    bz.xian = "豆腐";
                }
                bz.flag = true;
                count_bz++;
                bz.notify();
                System.out.println("老板：" + bz.pi + bz.xian + " 做好了，来吃");
            }
        }
    }
}

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/24 22:51
 * @Author : NekoSilverfox
 * @FileName: RunnableImpl
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */


/** 1.创建一个Runnable接口的实现类 */
public class RunnableImpl implements Runnable{
    // 2.在实现类中重写Runnable接口的run方法,设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "->" + i);
        }
    }
}

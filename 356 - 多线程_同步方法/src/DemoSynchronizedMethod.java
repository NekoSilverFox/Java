/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/25 15:13
 * @Author : NekoSilverfox
 * @FileName: DemoSynchronizedMethod
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 355 - 多线程_同步方法
 */
/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的二种方案:使用同步方法
    使用步骤:
        1.把访问了共享数据的代码抽取出来,放到一个方法中
        2.在方法上添加synchronized修饰符

    格式:定义方法的格式
    修饰符 synchronized 返回值类型 方法名(参数列表){
        可能会出现线程安全问题的代码(访问了共享数据的代码)
    }
 */
public class DemoSynchronizedMethod {
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

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/24 23:15
 * @Author : NekoSilverfox
 * @FileName: DemoInnerClassThread
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

/** 352 - 多线程_通过匿名内部类实现多线程的创建
    匿名内部类方式实现线程的创建

    匿名:没有名字
    内部类:写在其他类内部的类

    匿名内部类作用:简化代码
        把子类继承父类,重写父类的方法,创建子类对象合一步完成
        把实现类实现类接口,重写接口中的方法,创建实现类对象合成一步完成
    匿名内部类的最终产物:子类/实现类对象,而这个类没有名字

    格式:
        new 父类/接口(){
            重复父类/接口中的方法
        };
 */
public class DemoInnerClassThread {
    public static void main(String[] args) {
        // 线程的父类是Thread
        new Thread() {
            //重写run方法,设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "   UwU");
                }
            }
        }.start();


        // 线程的接口Runnable
        // Runnable r = new RunnableImpl(); 多态
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "     OwO");
                }
            }
        };
        new Thread(runnable).start();


        // 简化接口的方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "     QAQ");
                }
            }
        }).start();
    }
}

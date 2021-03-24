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
    public MyThread() {

    }
    /** 设置线程名称：
     *      方法一：
     *         使用Thread类中的方法：
     *         void setName(String name)
     *
     *      方法二：
     *          创建一个带参数的构造方法，参数传递线程的名称；调用父类的带参构造方法，把线程名称传递给父类，让父类（Thread）给子线程起一个名字
     *          Thread(String name) 分配新的Thread对象
     * */
    /* 使用方法二设置子线程名称 */
    public MyThread(String name) {
        // 把线程名称传递给父类，让父类（Thread）给子线程起一个名字
        super(name);
    }


    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Run:" + i);
        }
    }
}

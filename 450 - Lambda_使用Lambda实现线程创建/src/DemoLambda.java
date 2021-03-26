/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/26 21:22
 * @Author : NekoSilverfox
 * @FileName: DemoLambda
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 450 - Lambda_使用Lambda实现线程创建
 */

public class DemoLambda {
    public static void main(String[] args) {
        // 使用匿名内部类的方式创建多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " 使用匿名内部类的方式创建线程");
            }
        }).run();

        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + " 使用Lambda表达式创建线程");
        }).run();
    }
}

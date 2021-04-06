/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/6 20:32
 * @Author : NekoSilverfox
 * @FileName: Demo629TestClassInit
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 629 - 反射_测试类的初始化时机
public class Demo629TestClassInit {
    static {
        System.out.println("Main被加载了");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // 1. 主动引用
        Son son = new Son();

        // 反射也会产生主动引用，会极大地消耗资源
        Class.forName("Son");


        // ===============================================================
        // 不会产生引用的方法
        // 通过子类引用父类的静态变量不会产生初始化，甚至子类都不会被加载
        System.out.println(Son.f);

        // 通过数组不会引起类的初始化，因为数组只是一个名字和一片空间而已
        Son[] arr_son = new Son[10];

        // 调用子类常量池中的常量，不会引起父类和子类的初始化。因为常量在链接阶段就存入调用类的常量池当中了
        System.out.println(Son.M);

    }

}

class Father {
    static int f = 2;

    static {
        System.out.println("父类被加载了");
    }
}

class Son extends Father {
    static {
        System.out.println("子类被加载了");
        s = 300;
    }

    static int s = 100;
    static final int M = 1;
}

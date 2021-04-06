/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/6 20:21
 * @Author : NekoSilverfox
 * @FileName: Demo628ClassLoginInMerroy
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 628 - 反射_分析类加载到内存的过程
public class Demo628ClassLoginInMerroy {
    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.num);  // 100
    }
}

/**
 * 1. 加载到内存中，会产生一个类对应的Class文件
 * 2. 链接，链接结束后 m = 0;
 * 3. 初始化，（初始化时所有的静态代码块将会合并）
 *
 *  <cliint>() {
 *         System.out.println("A 中的静态代码块执行了");
 *         num = 300;
 *         num = 100;
 *  }
 */



class A {
    static {
        System.out.println("A 中的静态代码块执行了");
        num = 300;
    }

    static int num = 100;

    public A() {
        System.out.println("A 的无参构造器被调用了");
    }
}
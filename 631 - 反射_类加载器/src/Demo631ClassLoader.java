/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/6 22:29
 * @Author : NekoSilverfox
 * @FileName: Demo631ClassLoader
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 631 - 反射_类加载器
public class Demo631ClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取系统的类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);  // jdk.internal.loader.ClassLoaders$AppClassLoader@442d9b6e

        // 获取系统类加载器的父类加载器 --> 扩展类加载器
        ClassLoader loaderParent = systemClassLoader.getParent();
        System.out.println(loaderParent);  // jdk.internal.loader.ClassLoaders$PlatformClassLoader@61064425

        // 获取扩展类加载器的的父类加载器 --> 根加载器(C/C++)
        ClassLoader loaderParent2 = loaderParent.getParent();
        System.out.println(loaderParent2);  // null 因为使用C/C++写的，无法获取

        // 测试当前类是哪个类加载器写的
        ClassLoader demo631ClassLoader = Class.forName("Demo631ClassLoader").getClassLoader();
        System.out.println(demo631ClassLoader);  // jdk.internal.loader.ClassLoaders$AppClassLoader@442d9b6e

        // 测试JDK内置的类使用的哪个加载器
        ClassLoader classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);  // null  根加载器(C/C++)

        // 获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));

        // 双亲委派机制
        // ....以后有机会学习
    }
}

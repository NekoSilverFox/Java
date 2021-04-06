/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/6 17:10
 * @Author : NekoSilverfox
 * @FileName: DemoAnnotation
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */


@SuppressWarnings("all")  // 镇压警告，表示不提示所有警告，括号中的参数可以改变
public class DemoAnnotation extends Object{

    @Override  // 重写的注解
    public String toString() {
        return super.toString();
    }

    @Deprecated  // 表示不鼓励程序员使用，通常是因为它很危险或者存在更好的选择
    public static void demoMethod() {

    }

    public static void main(String[] args) {
        DemoAnnotation.demoMethod();
    }
}

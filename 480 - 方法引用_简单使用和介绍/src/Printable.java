/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 23:35
 * @Author : NekoSilverfox
 * @FileName: Printable
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    定义一个打印的函数式接口
 */
@FunctionalInterface
public interface Printable {
    // 定义字符串的【抽象】方法
    void myPrint(String s);
}

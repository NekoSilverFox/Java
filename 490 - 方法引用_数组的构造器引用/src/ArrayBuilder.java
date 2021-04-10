/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/11 1:31
 * @Author : NekoSilverfox
 * @FileName: ArrayBuilder
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    定义一个创建数组的函数式接口
 */
@FunctionalInterface
public interface ArrayBuilder {
    // 定义一个创建int类型数组的方法,参数传递数组的长度,返回创建好的int类型数组
    int[] buildArray(int length);
}

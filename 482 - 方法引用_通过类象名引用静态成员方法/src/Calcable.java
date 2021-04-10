/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 23:51
 * @Author : NekoSilverfox
 * @FileName: Calcable
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

@FunctionalInterface
public interface Calcable {
    // 定义一个抽象方法,传递一个整数,对整数进行绝对值计算并返回
    int calAbs(int num);
}

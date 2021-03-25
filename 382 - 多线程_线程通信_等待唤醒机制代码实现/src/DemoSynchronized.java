/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/25 23:35
 * @Author : NekoSilverfox
 * @FileName: DemoSynchronized
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 382 - 多线程_线程通信_等待唤醒机制代码实现
 */

public class DemoSynchronized {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();

        new BaoZiPu(bz).start();

        new ChiHuo(bz).start();
    }
}

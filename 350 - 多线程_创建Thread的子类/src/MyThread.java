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
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Run:" + i);
        }
    }
}

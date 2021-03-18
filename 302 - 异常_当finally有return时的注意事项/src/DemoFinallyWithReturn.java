/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/18 21:46
 * @Author : NekoSilverfox
 * @FileName: DemoFinallyWithReturn
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 302 - 异常_当finally有return时的注意事项
// 如果finally有return语句, 则永远返回finally中的结果,避免该情况.
public class DemoFinallyWithReturn {
    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);  // 是 100，而不是10！
    }

    //定义一个方法,返回变量a的值
    public static int getA() {
        int a = 10;
        try {
            return a;  // 这里没有返回！！！！！！！！
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            //一定会执行的代码
            a = 100;
            return a;  // 如果finally有return语句, 则永远返回finally中的结果，避免该情况！！！
        }
    }
}

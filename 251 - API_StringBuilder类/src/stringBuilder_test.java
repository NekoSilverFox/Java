/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/13 18:54
 * @Author : NekoSilverfox
 * @FileName: stringBuilder_test
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

// 【重点】 不建议直接相加 String 字符串，因为String字符串是不变的（底层有final修饰），每相加一个就会生成一个新的字符串。效率低下

// StringBuilder 字符缓冲区，可以提高字符串操作效率（看成一个长度可变的字符串）
// 底层也是一个数组，但是没有被final修饰，可以改变长度
// byte[] value = new byte[16] 初始容量是16

public class stringBuilder_test {
    /*
        java.lang.StringBuilder类:字符串缓冲区,可以提高字符串的效率
        构造方法:
            StringBuilder() 构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
            StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
     */
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1: " + bu1);

        StringBuilder bu2 = new StringBuilder("ABC");
        System.out.println("bu2: " + bu2);

        /** append可以追加【任意】类型的数据
         * 使用 append 不需要接受返回值*/
        bu2 = bu1.append("123");  // append 返回的是this
        System.out.println("bu1: " + bu1 + "\n"
                + "bu2: " + bu2 + "\n"
                + (bu1 == bu2));
        bu1.append(false);
        bu1.append('中');
        System.out.println(bu1);  // 123false中

        /**
         * 链式编程
         */
        bu1.append("1").append('ф').append(321).append("中国");
        System.out.println(bu1);  // 123false中1ф321中国
    }
}

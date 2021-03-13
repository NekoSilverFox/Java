/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/13 21:00
 * @Author : NekoSilverfox
 * @FileName: String2Value
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class String2Value {
    public static void main(String[] args) {
        /*
    基本类型与字符串类型之间的相互转换
    基本类型->字符串(String)
        1.基本类型的值+""  最简单的方法(工作中常用)
        2.包装类的静态方法toString(参数),不是Object类的toString() 重载
            static String toString(int i) 返回一个表示指定整数的 String 对象。
        3.String类的静态方法valueOf(参数)
            static String valueOf(int i) 返回 int 参数的字符串表示形式。
    字符串(String)->基本类型
        使用包装类的静态方法parseXXX("字符串");
            Integer类: static int parseInt(String s)
            Double类: static double parseDouble(String s)
 */

        // 基本类型->字符串(String)
        int num = 100;
        String str = num + "";
        System.out.println(str + 86);  // 10086

        String str_num = Integer.toString(num);
        System.out.println(str_num + 10);  // 10010

        str_num = String.valueOf(num);
        System.out.println(str + 66);  // 10066


        // 字符串(String)->基本类型
        int num2 = Integer.parseInt(str_num);
        System.out.println(num2 - 66);  // 34


    }
}

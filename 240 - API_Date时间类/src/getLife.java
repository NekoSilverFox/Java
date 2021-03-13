import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/13 14:34
 * @Author : NekoSilverfox
 * @FileName: getLife
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

/*
    练习:
        请使用日期时间相关的API，计算出一个人已经出生了多少天。
    分析:
        1.使用Scanner类中的方法next,获取出生日期
        2.使用DateFormat类中的方法parse,把字符串的出生日期,解析为Date格式的出生日期
        3.把Date格式的出生日期转换为毫秒值
        4.获取当前的日期,转换为毫秒值
        5.使用当前日期的毫秒值-出生日期的毫秒值
        6.把毫秒差值转换为天(s/1000/60/60/24)
 */

public class getLife {
    public static void main(String[] args) throws ParseException {
        // 1.使用Scanner类中的方法next,获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式为 yyyy-MM-dd：");
        String birthday = sc.next();

        // 2.使用DateFormat类中的方法parse,把字符串的出生日期,解析为Date格式的出生日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  // 【重点】 别忘了参数
        Date date_birthday = sdf.parse(birthday);

        // 3.把Date格式的出生日期转换为毫秒值
        Long ms_birthday = date_birthday.getTime();

        // 4.获取当前的日期,转换为毫秒值
        Long ms_now = new Date().getTime();

        // 5.使用当前日期的毫秒值-出生日期的毫秒值
        long life_time = ms_now - ms_birthday;

        // 6.把毫秒差值转换为天(s/1000/60/60/24)
        int life_day = (int) (life_time / 1000 / 60 / 60 / 24);
        System.out.println("你已经度过了：" + life_day + "天");
    }
}

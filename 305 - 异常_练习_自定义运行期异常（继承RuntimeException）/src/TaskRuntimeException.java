import java.util.Scanner;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/19 1:04
 * @Author : NekoSilverfox
 * @FileName: TaskRuntimeException
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    要求：我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册。

    分析:
        1.使用数组保存已经注册过的用户名(数据库)
        2.使用Scanner获取用户输入的注册的用户名(前端,页面)
        3.定义一个方法,对用户输入的中注册的用户名进行判断
            遍历存储已经注册过用户名的数组,获取每一个用户名
            使用获取到的用户名和用户输入的用户名比较
                true:
                    用户名已经存在,抛出RegisterException异常,告知用户 "该用户名已经被注册";
                false:
                    继续遍历比较
            如果循环结束了,还没有找到重复的用户名,提示用户 "恭喜您,注册成功!";
 */

// 305 - 异常_练习_自定义运行期异常（继承RuntimeException）
public class TaskRuntimeException {
    // 1.使用数组保存已经注册过的用户名(数据库)
    static String[] usernames = {"张三", "李四", "王五"};

    public static void main(String[] args) {
        //2.使用Scanner获取用户输入的注册的用户名(前端,页面)
        System.out.println("请输入用户名：");
        String name = new Scanner(System.in).next();
        checkUser(name);
    }

    //3.定义一个方法,对用户输入的中注册的用户名进行判断
    public static void checkUser(String name) {
        for (String ele : usernames) {
            if (ele.equals(name)) {
                // true:用户名已经存在,抛出RegisterException异常,告知用户 "该用户名已经被注册";
                throw new RegisterException("该用户名已经被注册");  // 【重点】抛出运行期异常,无需处理,交给JVM处理（中断处理）
            }
        }
        System.out.println("恭喜您,注册成功!");
    }

}

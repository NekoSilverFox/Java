/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/16 18:08
 * @Author : NekoSilverfox
 * @FileName: DemoVarAgrs
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 061 - 可变参数

    /*
    可变参数:是JDK1.5之后出现的新特性
    使用前提:
        当方法的参数列表数据类型已经确定,但是参数的个数不确定,就可以使用可变参数.
    使用格式:定义方法时使用
        修饰符 返回值类型 方法名(数据类型...变量名){}
    可变参数的原理:
        可变参数底层就是一个数组,根据传递参数个数不同,会创建不同长度的数组,来存储这些参数
        传递的参数个数,可以是0个(不传递),1,2...多个
    可变参数的注意事项：
        1. 一个方法的参数列表,只能有一个可变参数
        2. 如果方法的参数有多个,那么可变参数必须写在参数列表的末尾
 */

public class DemoVarArgs {
    public static void main(String[] args) {
        int sum = add(10, 20, 30, 40, 50);
        System.out.println(sum);
    }

        /*
        定义计算(0-n)整数和的方法
        已知:计算整数的和,数据类型已经确定int
        但是参数的个数不确定,不知道要计算几个整数的和,就可以使用可变参数
        add(); 就会创建一个长度为0的数组, new int[0]
        add(10); 就会创建一个长度为1的数组,存储传递来过的参数 new int[]{10};
        add(10,20); 就会创建一个长度为2的数组,存储传递来过的参数 new int[]{10,20};
        add(10,20,30,40,50,60,70,80,90,100); 就会创建一个长度为2的数组,存储传递来过的参数 new int[]{10,20,30,40,50,60,70,80,90,100};
     */
    public static int add(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    //可变参数的特殊(终极)写法
    public static void method(Object... obj) {

    }
}

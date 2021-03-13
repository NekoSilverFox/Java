/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/13 19:55
 * @Author : NekoSilverfox
 * @FileName: Demo003Integer
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 003 - 拆箱与装箱
    /*
    装箱:把基本类型的数据,包装到包装类中(基本类型的数据->包装类)
        构造方法:
            Integer(int value) 构造一个新分配的 Integer 对象，它表示指定的 int 值。
            Integer(String s) 构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
                传递的字符串,必须是基本类型的字符串,否则会抛出异常 "100" 正确  "a" 抛异常
        静态方法:
            static Integer valueOf(int i) 返回一个表示指定的 int 值的 Integer 实例。
            static Integer valueOf(String s) 返回保存指定的 String 的值的 Integer 对象。
    拆箱:在包装类中取出基本类型的数据(包装类->基本类型的数据)
        成员方法:
            int intValue() 以 int 类型返回该 Integer 的值。
 */
public class Demo003Integer {
    public static void main(String[] args) {
        // 装箱: 把基本类型的数据,包装到包装类中(基本类型的数据->包装类)
        Integer i1 = new Integer(1);  // 方法上有横线，说明方法过时了
        System.out.println(i1);

        Integer i2 = new Integer("2");
        System.out.println(i2);

        Integer i3 = Integer.valueOf("3");
        System.out.println(i3);

        // 拆箱：把包装类转换为基本数据类型
        int i4 = i3.intValue();
        System.out.println(i4);
    }
}

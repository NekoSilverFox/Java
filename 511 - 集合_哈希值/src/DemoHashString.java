import java.util.HashSet;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/16 13:52
 * @Author : NekoSilverfox
 * @FileName: DemoHashString
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 511 - 集合_哈希值
/*
    哈希值是一个十进制的整数，由系统随机给出（就是对象的地址，是一个逻辑地址，是模拟出来得到的地址，不是数据实际存储的物理地址）
    在 Object 类有一个方法，可以获取对象的哈希值
    int hashCode() 返回的是对象的哈希码值

    hashCode 方法原码：
        public native int hashcode();
        native 代表该方法调用的是本地操作系统的方法
*/
public class DemoHashString {
    public static void main(String[] args) {
        // Person 继承了Object类，所以可以使用Object类的hashCode方法
        Person p1 = new Person();
        int hash_p1 = p1.hashCode();
        System.out.println("Hash Code p1: " + hash_p1);  // Hash Code p1: 42121758    |    233333333
        System.out.println(p1);

        Person p2 = new Person();
        int hash_p2 = p2.hashCode();
        System.out.println("Hash code p2: " + hash_p2);  // Hash code p2: 93122545    |    233333333
        System.out.println(p2);
        System.out.println(p1 == p2);  // false

        String str_1 = "abc";
        String str_2 = "abc";
        System.out.println("String 1 `abc` 的哈希值：" + str_1.hashCode() + "\n"  // String 1 `abc` 的哈希值：96354
                + "String 2 `abc` 的哈希值：" + str_2.hashCode());  // String 2 `abc` 的哈希值：96354
        System.out.println(str_1 == str_2);  // true

        // 哈希冲突
        System.out.println("重地".hashCode());  // 1179395
        System.out.println("通话".hashCode());  // 1179395
    }

}

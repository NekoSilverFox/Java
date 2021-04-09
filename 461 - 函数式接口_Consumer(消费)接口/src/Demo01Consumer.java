import java.util.function.Consumer;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/9 23:50
 * @Author : NekoSilverfox
 * @FileName: Demo01Consumer
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 461 - 函数式接口_SupplierConsumer(消费)接口
/*
    java.util.function.Consumer<T>接口则正好与Supplier接口相反，
        它不是生产一个数据，而是消费一个数据，其数据类型由泛型决定。
    Consumer接口中包含抽象方法void accept(T t)，意为消费一个指定泛型的数据。

   Consumer接口是一个消费型接口,泛型执行什么类型,就可以使用accept方法消费什么类型的数据
   至于具体怎么消费(使用),需要自定义(输出,计算....)
 */
public class Demo01Consumer {
    /*
        定义一个方法
        方法的参数传递一个字符串的姓名
        方法的参数传递Consumer接口,泛型使用String
        可以使用Consumer接口消费字符串的姓名
     */
    public static void method(String str, Consumer<String> son) {
        son.accept(str);
    }

    public static void main(String[] args) {
        // 调用method方法,传递字符串姓名,方法的另一个参数是Consumer接口,是一个函数式接口,所以可以传递Lambda表达式
        method("即将消逝的冰糖雪狸", (String str) -> {
            // 对传递的字符串进行消费
            // 消费方式:直接输出字符串
            // System.out.println(name);

            String reverse_str = new StringBuffer(str).reverse().toString();
            System.out.println(reverse_str);
        });

    }
}

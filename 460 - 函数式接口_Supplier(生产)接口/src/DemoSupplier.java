import java.util.function.Supplier;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/9 23:41
 * @Author : NekoSilverfox
 * @FileName: DemoSupplier
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 460 - 函数式接口_Supplier(生产)接口
/*
    常用的函数式接口
    java.util.function.Supplier<T>接口仅包含一个无参的方法：T get()。用来获取一个泛型参数指定类型的对象数据。

    Supplier<T>接口被称之为生产型接口,指定接口的泛型是什么类型,那么接口中的get方法就会生产什么类型的数据
 */
public class DemoSupplier {
    // 定义一个方法,方法的参数传递Supplier<T>接口,泛型执行String,get方法就会返回一个String
    public static String getString(Supplier<String> str) {
        return str.get();
    }

    public static void main(String[] args) {
        // 调用getString方法,方法的参数Supplier是一个函数式接口,所以可以传递Lambda表达式
        String s = getString(() -> {
            return "冰糖雪狸";
        });
        System.out.println(s);

        String s1 = getString(() -> "Silverfox");
        System.out.println(s1);
    }
}

import java.util.Objects;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/18 20:05
 * @Author : NekoSilverfox
 * @FileName: DemoObjects
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

/*
    Objects类中的静态方法
    public static <T> T requireNonNull(T obj):查看指定引用对象不是null，可以替代我们抛出异常。
    源码:
        public static <T> T requireNonNull(T obj) {
            if (obj == null)
                throw new NullPointerException();
            return obj;
        }
 */

public class DemoObjects {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object obj) {
        //对传递过来的参数进行合法性判断,判断是否为null
//        if (obj == null) {
//            throw new NullPointerException("参数不能为null");
//        }

        // 使用 ObjectS 中的 requireNonNull 检验和抛出异常
//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj, "参数不能为null");
    }

}

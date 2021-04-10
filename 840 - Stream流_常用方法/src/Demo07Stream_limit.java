import java.util.stream.Stream;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 21:54
 * @Author : NekoSilverfox
 * @FileName: Demo07Stream_limit
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    Stream流中的常用方法_limit:用于截取流中的元素
    limit方法可以对流进行截取，只取用前n个。方法签名：
    Stream<T> limit(long maxSize);
        参数是一个long型，如果集合当前长度大于参数则进行截取；否则不进行操作
    limit方法是一个延迟方法,只是对流中的元素进行截取,返回的是一个新的流,所以可以继续调用Stream流中的其他方法
 */
public class Demo07Stream_limit {
    public static void main(String[] args) {
        // 获取一个Stream流
        String[] arrString = {"Silverfox", "Cat", "Dog", "Bird", "Fox", "Panda"};
        Stream<String> stream = Stream.of(arrString);

        // 使用limit对Stream流中的元素进行截取,只要前3个元素'
        Stream<String> limit = stream.limit(3);

        limit.forEach(s -> System.out.println(s));

    }
}

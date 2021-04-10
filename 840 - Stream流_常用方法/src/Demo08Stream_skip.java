import java.util.stream.Stream;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 22:00
 * @Author : NekoSilverfox
 * @FileName: Demo08Stream_skip
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    Stream流中的常用方法_skip:用于跳过元素
    如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流：
    Stream<T> skip(long n);
        如果流的当前长度大于n，则跳过前n个；否则将会得到一个长度为0的空流。
 */
public class Demo08Stream_skip {
    public static void main(String[] args) {
        // 获取一个Stream流
        String[] arrString = {"Silverfox", "Cat", "Dog", "Bird", "Fox", "Panda"};
        Stream<String> stream = Stream.of(arrString);

        // 使用skip方法跳过前3个元素
        Stream<String> skip = stream.skip(3);
        skip.forEach(s -> System.out.println(s));
    }
}

import java.util.stream.Stream;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 21:50
 * @Author : NekoSilverfox
 * @FileName: Demo05Stream_map
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    Stream流中的常用方法_map:用于类型转换
    如果需要将流中的元素映射到另一个流中，可以使用map方法.
    <R> Stream<R> map(Function<? super T, ? extends R> mapper);
    该接口需要一个Function函数式接口参数，可以将当前流中的T类型数据转换为另一种R类型的流。
    Function中的抽象方法:
        R apply(T t);
 */
public class Demo05Stream_map {
    public static void main(String[] args) {
        // 获取一个String类型的Stream流
        Stream<String> stream = Stream.of("1", "2", "3", "4");

        // 使用map方法,把字符串类型的整数,转换(映射)为Integer类型的整数
        Stream<Integer> integerStream = stream.map(str -> Integer.parseInt(str));

        integerStream.forEach(num -> System.out.println(num));
    }
}

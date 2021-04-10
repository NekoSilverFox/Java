import java.util.stream.Stream;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 22:02
 * @Author : NekoSilverfox
 * @FileName: Demo09Stream_concat
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    Stream流中的常用方法_concat:用于把流组合到一起
    如果有两个流，希望合并成为一个流，那么可以使用Stream接口的静态方法concat
    static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */
public class Demo09Stream_concat {
    public static void main(String[] args) {
        String[] arrString1 = {"冰糖雪狸", "夜良"};
        Stream<String> stream1 = Stream.of(arrString1);

        // 【重点】用这样创建Stream
        Stream<String> stream2 = Stream.of("Silverfox", "Cat", "Dog", "Bird", "Fox", "Panda");

        // 把以上两个流组合为一个流
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(s -> System.out.println(s));
    }
}

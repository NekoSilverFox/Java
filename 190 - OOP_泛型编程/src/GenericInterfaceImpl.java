/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/15 14:51
 * @Author : NekoSilverfox
 * @FileName: GenericInterfaceIml
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

/*
    含有泛型的接口,第一种使用方式:定义接口的实现类,实现接口,指定接口的泛型
    public interface Iterator<E> {
        E next();
    }
    Scanner类实现了Iterator接口,并指定接口的泛型为String,所以重写的next方法泛型默认就是String
    public final class Scanner implements Iterator<String>{
        public String next() {}
    }
 */

public class GenericInterfaceImpl implements GenericInterface<String>{
    @Override
    public void print(String a) {
        System.out.println(a);
    }
}

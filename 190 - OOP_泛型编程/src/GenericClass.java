/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/14 23:37
 * @Author : NekoSilverfox
 * @FileName: GenericClass
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */


/*
    定义一个含有泛型的类,模拟ArrayList集合
    泛型是一个未知的数据类型,当我们不确定什么什么数据类型的时候,可以使用泛型
    泛型可以接收任意的数据类型,可以使用Integer,String,Student...
    创建对象的时候确定泛型的数据类型

 */
public class GenericClass<E> {  // E - Element
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}

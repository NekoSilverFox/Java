/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/11 1:19
 * @Author : NekoSilverfox
 * @FileName: PersonBuilder
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    定义一个创建Person对象的函数式接口
 */
    @FunctionalInterface
public interface PersonBuilder {
    //定义一个方法,根据传递的姓名,创建Person对象返回
    Person personBuilder(String name);

}

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/11 1:19
 * @Author : NekoSilverfox
 * @FileName: Demo
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 486 - 方法引用_类的构造器(构造方法)引用

public class Demo {
    // 定义一个方法,参数传递姓名和PersonBuilder接口,方法中通过姓名创建Person对象
    public static void usePersonObj(String name, PersonBuilder personBuilder) {
        Person person = personBuilder.personBuilder(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        // 调用printName方法,方法的参数PersonBuilder接口是一个函数式接口,可以传递Lambda
        usePersonObj("Silverfox", name -> new Person(name));

        /*
            使用方法引用优化Lambda表达式
            构造方法new Person(String name) 已知
            创建对象已知 new
            就可以使用Person引用new创建对象
         */
        usePersonObj("冰糖雪狸", Person::new);
    }
}

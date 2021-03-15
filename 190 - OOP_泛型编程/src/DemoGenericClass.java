/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/14 23:39
 * @Author : NekoSilverfox
 * @FileName: DemoGenericClass
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoGenericClass {
    public static void main(String[] args) {
        // 不写泛型，默认Object类型
        GenericClass gc = new GenericClass();
        gc.setName("Only String");
        System.out.println(gc.getName());

        // 使用泛型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(2);
        System.out.println(gc2.getName());
    }
}

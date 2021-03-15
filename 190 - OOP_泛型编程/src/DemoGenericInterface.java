/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/15 14:55
 * @Author : NekoSilverfox
 * @FileName: DemoGenericInterface
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoGenericInterface {
    public static void main(String[] args) {
        // 接口实现类中指定了泛型的类型
        GenericInterfaceImpl gii = new GenericInterfaceImpl();
        gii.print("asd");

        // 接口的实现类中继续使用了泛型
        GenericInterfaceImpl2<Integer> gii2 = new GenericInterfaceImpl2<>();
        gii2.print(45679);

    }
}

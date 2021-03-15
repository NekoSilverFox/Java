/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/15 14:59
 * @Author : NekoSilverfox
 * @FileName: DemoGenericInterfaceImpl2
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

// 对于接口的实现类也使用泛型 就可以使实现类中的方法也拥有泛型
public class GenericInterfaceImpl2<I> implements GenericInterface<I> {
    @Override
    public void print(I a) {
        System.out.println(a);
    }
}

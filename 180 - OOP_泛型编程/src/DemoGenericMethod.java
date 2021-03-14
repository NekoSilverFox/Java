/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/14 23:53
 * @Author : NekoSilverfox
 * @FileName: DemoGenericMethod
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoGenericMethod {
    public static void main(String[] args) {
        //创建GenericMethod对象
        GenericMethod gm = new GenericMethod();
        /*
            调用含有泛型的方法printValue
            【重点】 传递什么类型,泛型就是什么类型
         */
        gm.printValue(1);
        gm.printValue(2.33);
        gm.printValue("asd");
        gm.printValue(false);


        // 静态方法,通过类名.方法名(参数)可以直接使用
        GenericMethod.staticPrintValue("Static method!");
        GenericMethod.staticPrintValue(3.23);
    }
}

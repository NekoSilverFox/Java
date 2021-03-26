/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/26 21:46
 * @Author : NekoSilverfox
 * @FileName: DemoLambda
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 451 - Lambda_标准格式（无参无返回值）
 */
/*
    Lambda表达式的标准格式:
        由三部分组成:
            a.一些参数
            b.一个箭头
            c.一段代码
        格式:
            (参数列表) -> {一些重写方法的代码};
        解释说明格式:
            ():接口中抽象方法的参数列表,没有参数,就空着;有参数就写出参数,多个参数使用逗号分隔
            ->:传递的意思,把参数传递给方法体{}
            {}:重写接口的抽象方法的方法体
 */
    /*
    需求:
        给定一个厨子Cook接口，内含唯一的抽象方法makeFood，且无参数、无返回值。
        使用Lambda的标准格式调用invokeCook方法，打印输出“吃饭啦！”字样
 */
public class DemoLambda {
    public static void main(String[] args) {
        //使用匿名内部类的方式，调用invokeCook方法,参数是Cook接口,传递Cook接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("使用匿名内部类方式构建");
            }
        });

        // 使用Lambda表达式,简化匿名内部类的书写
        invokeCook(()->{
            System.out.println("使用Lambda表达式");
        });

        // 优化省略Lambda
        invokeCook(()-> System.out.println("使用优化省略的Lambda"));
    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}

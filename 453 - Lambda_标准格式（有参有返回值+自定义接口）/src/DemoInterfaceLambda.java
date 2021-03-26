/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/26 22:10
 * @Author : NekoSilverfox
 * @FileName: DemoInterfaceLambda
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 453 - Lambda_标准格式（有参有返回值+自定义接口）
 */
/*
    Lambda表达式有参数有返回值的练习
    需求:
        给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
        使用Lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
 */
public class DemoInterfaceLambda {
    public static void main(String[] args) {
        // 调用invokeCalc方法,方法的参数是一个接口,可以使用匿名内部类
        invokeCalc(10, 15, new Calculator() {
            @Override
            public int sum(int l, int r) {
                return l + r;
            }
        });

        // 使用Lambda表达式简化匿名内部类的书写
        invokeCalc(3, 7, (int l, int r)->{
            return l + r;
        });

        // 优化省略Lambda
        invokeCalc(5, 4, (l, r)->{return l + r;});

        // 极简版
        invokeCalc(5, 4, (l, r)->l + r);
    }


    /*
        定义一个方法
        参数传递两个int类型的整数
        参数传递Calculator接口
        方法内部调用Calculator中的方法calc计算两个整数的和
 */
    public static void invokeCalc(int l, int r, Calculator calculator) {
        int sum = calculator.sum(l, r);
        System.out.println("Sum = " + sum);
    }
}

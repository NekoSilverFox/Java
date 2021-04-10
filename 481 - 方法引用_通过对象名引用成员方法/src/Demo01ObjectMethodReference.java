/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 23:43
 * @Author : NekoSilverfox
 * @FileName: Demo01ObjectMethodReference
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 481 - 方法引用_通过类象名引用静态成员方法 通过对象名引用成员方法
/*
    通过对象名引用成员方法
    使用前提是对象名是已经存在的,成员方法也是已经存在
    就可以使用对象名来引用成员方法
 */
public class Demo01ObjectMethodReference {
    // 定义一个方法,方法的参数传递Printable接口
    public static void printString(Printable p) {
        p.myPrint("Hello world");
    }
    public static void main(String[] args) {
        // 调用printString方法,方法的参数Printable是一个函数式接口,所以可以传递Lambda表达式
        printString((str) -> {
            // 创建MethodRerObject对象
            MethodRerObject methodRerObject = new MethodRerObject();

            // 调用MethodRerObject对象中的成员方法printUpperCaseString,把字符串按照大写输出
            methodRerObject.printUpperCaseString(str);  // HELLO WORLD
        });


        /*
            使用方法引用优化Lambda
            对象是已经存在的MethodRerObject
            成员方法也是已经存在的printUpperCaseString
            所以我们可以使用对象名引用成员方法
         */
        //创建MethodRerObject对象
        MethodRerObject methodRerObject = new MethodRerObject();
        printString(methodRerObject::printUpperCaseString);  // HELLO WORLD


    }
}

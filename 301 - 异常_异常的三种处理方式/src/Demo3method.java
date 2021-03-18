import java.util.List;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/18 21:28
 * @Author : NekoSilverfox
 * @FileName: Demo3method
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 301 - 异常_异常的三种处理方式
/*
    多个异常使用捕获又该如何处理呢？
    1. 多个异常分别处理。
    2. 多个异常一次捕获，多次处理。
    3. 多个异常一次捕获一次处理。
 */
public class Demo3method {
    public static void main(String[] args) {
        // 1. 多个异常分别处理
//        demo1();

        // 2. 多个异常一次捕获，多次处理。
//        demo2();

        // 3. 多个异常一次捕获一次处理。
        demo3();
    }

    // 1. 多个异常分别处理。
    public static void demo1() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);  //ArrayIndexOutOfBoundsException: 3
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));  //IndexOutOfBoundsException: Index 3 out-of-bounds for length 3
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    // 2. 多个异常一次捕获，多次处理。
    public static void demo2() {
        try {
            int[] arr = {1, 2, 3};
            //System.out.println(arr[3]);  //ArrayIndexOutOfBoundsException: 3
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));  //IndexOutOfBoundsException: Index 3 out-of-bounds for length 3
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

            /* 一个try多个catch注意事项: 【重点】
                catch里边定义的异常变量, 【如果有子父类关系, 那么子类的异常变量必须写在上边,否则就会报错】
                ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException*/
//        try {
//            int[] arr = {1,2,3};
//            //System.out.println(arr[3]);//ArrayIndexOutOfBoundsException: 3
//            List<Integer> list = List.of(1, 2, 3);
//            System.out.println(list.get(3));//IndexOutOfBoundsException: Index 3 out-of-bounds for length 3
//        }catch (IndexOutOfBoundsException e){
//            System.out.println(e);
//        }catch (ArrayIndexOutOfBoundsException e){  报错！！！
//            System.out.println(e);
//        }
    }

    // 3. 多个异常一次捕获一次处理（用Exception接收）
    public static void demo3() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);  // ArrayIndexOutOfBoundsException: 3
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));  // IndexOutOfBoundsException: Index 3 out-of-bounds for length 3
        } catch (Exception e) {
            System.out.println(e);
        }

        // 【重点】 运行时异常被抛出可以不处理。即不捕获也不声明抛出。
        //        默认给虚拟机处理, 终止程序, 什么时候不抛出运行时异常了, 再来继续执行程序
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);//ArrayIndexOutOfBoundsException: 3
        List<Integer> list = List.of(1, 2, 3);
        System.out.println(list.get(3));//IndexOutOfBoundsException: Index 3 out-of-bounds for length 3

        System.out.println("后续代码!");
    }
}

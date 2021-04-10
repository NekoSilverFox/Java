import java.util.Arrays;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/11 1:31
 * @Author : NekoSilverfox
 * @FileName: DemoArray
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 490 - 方法引用_数组的构造器引用
public class DemoArray {
    /*
        定义一个方法
        方法的参数传递创建数组的长度和ArrayBuilder接口
        方法内部根据传递的长度使用ArrayBuilder中的方法创建数组并返回
     */
    public static int[] createArray(int length, ArrayBuilder arrayBuilder) {
        return arrayBuilder.buildArray(length);
    }

    public static void main(String[] args) {
        // 调用createArray方法,传递数组的长度和Lambda表达式
        int[] array = createArray(10, length -> new int[length]);
        System.out.println(array.length);

        /*
            使用方法引用优化Lambda表达式
            已知创建的就是int[]数组
            数组的长度也是已知的
            就可以使用方法引用
            int[]引用new,根据参数传递的长度来创建数组
         */
        int[] array1 = createArray(23, int[]::new);
        System.out.println(array1.length);
        System.out.println(Arrays.toString(array1));
    }

}

import java.util.function.Supplier;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/9 23:45
 * @Author : NekoSilverfox
 * @FileName: TaskSupplierMax
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    练习：求数组元素最大值
        使用Supplier接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。
        提示：接口的泛型请使用java.lang.Integer类。
 */
public class TaskSupplierMax {
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        // 定义一个int类型的数组,并赋值
        int[] arr = {100, 0, -50, 880, 99, 33, -30};

        int result = getMax(() -> {
            int max = arr[0];

            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });

        System.out.println("Max: " + result);
    }
}

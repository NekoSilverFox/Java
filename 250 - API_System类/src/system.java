import java.util.Arrays;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/13 18:30
 * @Author : NekoSilverfox
 * @FileName: system
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class system {
    public static void main(String[] args) {
        currentTimeMillis_method();
        arraycopy_method();
    }

    /*
        public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
        用来程序的效率
        验证for循环打印数字1-9999所需要使用的时间（毫秒）
    */
    private static void currentTimeMillis_method() {
        // 程序执行前,获取一次毫秒值
        long start_time = System.currentTimeMillis();

        // 执行for循环
        for (int i = 0; i < 99999; i++) {
            System.out.println(i);
        }

        // 程序执行后,获取一次毫秒值
        long end_time = System.currentTimeMillis();

        System.out.println("for循环结束，共用时：" + (end_time - start_time) + "ms");
    }

        /*
        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：将数组中指定的数据拷贝到另一个数组中。
        参数:
            src - 源数组。
            srcPos - 源数组中的起始位置(起始索引)。
            dest - 目标数组。
            destPos - 目标数据中的起始位置。
            length - 要复制的数组元素的数量。
        练习:
            将src数组中前3个元素，复制到dest数组的前3个位置上
                复制元素前：
                src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
                复制元素后：
                src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
     */
    private static void arraycopy_method() {
        int[] src = {1,2,3,4,5};
        int[] dest = {1,2,3,9,10};

        System.out.println("复制前：" + Arrays.toString(dest));
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("复制后：" + Arrays.toString(dest));

    }
}

import java.util.ArrayList;

/** 自动装箱与拆箱
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/13 20:07
 * @Author : NekoSilverfox
 * @FileName: AutoInteger
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class AutoInteger {
    public static void main(String[] args) {
        /*
            自动装箱与自动拆箱:基本类型的数据和包装类之间可以自动的相互转换
            JDK1.5之后出现的新特性
         */
        Integer i = 1;

        /*
            自动拆箱:in是包装类,无法直接参与运算,可以自动转换为基本数据类型,在进行计算
            in+2;就相当于 in.intVale() + 2 = 3
            in = in.intVale() + 2 = 3 又是一个自动装箱
         */
        i += 2;

         /*
            ArrayList集合无法直接存储整数,可以存储Integer包装类
         */
        ArrayList<Integer> arr_list = new ArrayList<>();
        arr_list.add(1);  // -->自动装箱 list.add(new Integer(1));
        int a = arr_list.get(0);  // -->自动拆箱  list.get(0).intValue();
        int i2 = i;  // -->自动拆箱  list.get(0).intValue();
        System.out.println(i2);
    }
}

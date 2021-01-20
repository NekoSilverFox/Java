// 230 - API_Math的基本使用

/*
java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。

    public static double abs(double num)：获取绝对值。有多种重载。
    public static double ceil(double num)：向上取整，只对小数部分有效。
    public static double floor(double num)：向下取整，只对小数部分有效。
    public static long round(double num)：四舍五入，只对小数部分有效。

Math.PI代表近似的圆周率常量（double）。
 */

public class Demo230Math {
    public static void main(String[] args) {
        // 获取绝对值
        System.out.println(Math.abs(-1));
        System.out.println(Math.abs(-0));
        System.out.println(Math.abs(-3.14));

        System.out.println("=====================");

        // 向上取整
        System.out.println(Math.ceil(3.9)); // 4.0
        System.out.println(Math.ceil(39)); // 39.0
        System.out.println(Math.ceil(-3.9)); // -3.0
        System.out.println(Math.ceil(-39)); // -39.0

        System.out.println("=====================");

        // 向下取整
        System.out.println(Math.floor(3.9)); // 3.0
        System.out.println(Math.floor(-3.9)); // -4.0

        System.out.println("=====================");

        System.out.println(Math.round(3.14)); // 3
        System.out.println(Math.round(3.54)); // 4
        System.out.println(Math.round(-3.14)); // -3 【注意】
        System.out.println(Math.round(-3.5)); // -3
        System.out.println(Math.round(-3.6)); // -4

        System.out.println("=====================");
        System.out.println(Math.PI);
    }
}

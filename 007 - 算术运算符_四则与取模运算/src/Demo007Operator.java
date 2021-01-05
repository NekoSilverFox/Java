/*
注意事项：
    1. 取模运算只有对于整数才有意义
    2. 如果涉及到不同类型的数据，则按照数据类型大的那种
 */


public class Demo007Operator {
    public static void main(String[] args) {

        System.out.println(10 + 20);

        int a = 1;
        int b = 2;
        System.out.println(a + b);

        int c = 10;
        int d = 3;
        System.out.println(c / d);

        double e = 12.4;
        int f = 3;
        System.out.println(e / f);

        // 取模运算
        System.out.println(10 % 3);
    }
}

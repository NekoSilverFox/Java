// 024 - 练习_使用if替换三元运算符判断两个数中的最大值
public class Demo024Max {
    public static void main(String[] args) {
        int a = 105;
        int b = 20;

        // 首先使用三元运算符
        // int max = a > b ? a : b;

        // 使用今天的if语句
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        System.out.println("最大值：" + max);
    }
}

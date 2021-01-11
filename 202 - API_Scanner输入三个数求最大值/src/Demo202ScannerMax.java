// 202 - API_Scanner输入三个数求最大值

/*
题目：
键盘输入三个int数字，然后求出其中的最大值。

思路：
    1. 既然是键盘输入，肯定需要用到Scanner
    2. Scanner三个步骤：导包、创建、使用nextInt()方法
    3. 既然是三个数字，那么调用三次nextInt()方法，得到三个int变量
    4. 无法同时判断三个数字谁最大，应该转换成为两个步骤：
        4.1 首先判断前两个当中谁最大，拿到前两个的最大值
        4.2 拿着前两个中的最大值，再和第三个数字比较，得到三个数字当中的最大值
    5. 打印最终结果
 */

import java.util.Scanner;

public class Demo202ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第 1 个数：");
        int max = sc.nextInt();
        for (int i = 0; i < 2; i++) {
            System.out.print("请输入第 " + (i + 1) + " 个数：");
            int tmp = sc.nextInt();
            if (tmp > max) {
                max = tmp;
            }
        }
        System.out.println("最大值为：" + max);
    }
}

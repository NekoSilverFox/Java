// 203 - API_Scanner配合匿名对象

import java.util.Scanner;

public class Demo203Anonymous {
    public static void main(String[] args) {
        // 普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        // 使用匿名对象
//        int num = new Scanner(System.in).nextInt();

        // 使用匿名对象进行传参
//        method(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("Input : " + num);
    }

    public static void method(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("Input : " + num);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }

}

/*
数据类型转换_强制转换:
    1. 特点：代码需要进行特殊的格式处理，不能自动完成
    2. 格式：范围小的类型 范围小的变量名 = (范围小的类型) 原本范围大的类型

注意事项：
    1. 强制类型转换一般不推荐使用，因为会造成精度损失，数据溢出
    2. byte/short/char 这三种都可以发生数学运算，例如加法
    3. byte/short/char 在运算时会首先体变成 int 再进行运算
    4. boolean 不能发生数据类型转换
 */

public class Demo02DataType {
    public static void main(String[] args) {

        // long --> int
        int num1 = (int)101L;
        System.out.println(num1);

//        int num2 = (int)6000000000; // 发生错误，溢出
//        System.out.println(num2);

        int num3 = (int)3.94; // 直接舍去所有小数位
        System.out.println(num3);

        char c1 = 'A';
        System.out.println(c1 + 1); // 打印 ASCII 码

        byte num4 = 40;
        byte num5 = 50;
//        byte num6 = num4 + num5; // 报错 byte/short/char 在运算时会首先体变成 int 再进行运算
//        byte + byte --> int + int --> int
        int res1 = num4 + num5;
        System.out.println(res1);

        short num6 = 60;
        // byte + short --> int + int --> int
        short res2 = (short)(num5 + num6);
        System.out.println(res2);
    }
}

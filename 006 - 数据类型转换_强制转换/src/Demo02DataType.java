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

        /*
        对于byte/short/char三种类型来说，如果右侧赋值的数值没有超过范围，
        那么javac编译器将会自动隐含地为我们补上一个(byte)(short)(char)。

            1. 如果没有超过左侧的范围，编译器补上强转。
            2. 如果右侧超过了左侧范围，那么直接编译器报错。

            在给变量进行赋值的时候，如果右侧的表达式当中全都是常量，没有任何变量，
            那么编译器javac将会直接将若干个常量表达式计算得到结果。
            short result = 5 + 8; // 等号右边全都是常量，没有任何变量参与运算
            编译之后，得到的.class字节码文件当中相当于【直接就是】：
            short result = 13;
            右侧的常量结果数值，没有超过左侧范围，所以正确。

            这称为“编译器的常量优化”。

            但是注意：一旦表达式当中有变量参与，那么就不能进行这种优化了。
        */
        // 右侧确实是一个int数字，但是没有超过左侧的范围，就是正确的。
        // int --> byte，不是自动类型转换
        byte num = /*(byte)*/ 30; // 右侧没有超过左侧的范围
        System.out.println(num); // 30

        // byte num2 = 128; // 右侧超过了左侧的范围

        // int --> char，没有超过范围
        // 编译器将会自动补上一个隐含的(char)
        char zifu = /*(char)*/ 65;
        System.out.println(zifu); // A

        // =================================================================

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

/*
当数据类型不一样时，将会发生数据类型的转换

自动数据类型的转换(隐式)
    1. 特点：代码不需要进行特殊处理，自动完成
    2. 规则：数据范围从小到大，但是字节数不一定相关

强制类型转换
 */
public class Demo01DataType {
    public static void main(String[] args) {
        System.out.println(1024); // 这是一个整数，默认就是int类型
        System.out.println(3.14); // 浮点数，默认double

        // 左边是double，右边是int，左右不一样
        long num1 = 100;
        System.out.println(num1); // 100

        // 左值double，右值float
        double num2 = 3.14F;
        System.out.println(num2);


        // ****************************************
        // 左值float，右值long
        float num3 = 100L;
        System.out.println(num3);

        double num4 = 100L;
        System.out.println(num4);
    }
}

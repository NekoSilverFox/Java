/*
数据类型转换_强制转换:
    1. 特点：代码需要进行特殊的格式处理，不能自动完成
    2. 格式：范围小的类型 范围小的变量名 = (范围小的类型) 原本范围大的类型
 */

public class Demo02DataType {
    public static void main(String[] args) {

        // long --> int
        int num1 = (int)101L;
        System.out.println(num1);
    }
}

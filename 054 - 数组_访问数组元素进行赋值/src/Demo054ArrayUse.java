// 054 - 数组_访问数组元素进行赋值

/*
使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值。规则如下：
    如果是整数类型，那么默认为0；
    如果是浮点类型，那么默认为0.0；
    如果是字符类型，那么默认为'\u0000'；
    如果是布尔类型，那么默认为false；
    如果是引用类型，那么默认为null。

注意事项：
    静态初始化其实也有默认值的过程，只不过系统自动马上将默认值替换成为了大括号当中的具体数值。
    如果没有提供的值就位默认值
 */

public class Demo054ArrayUse {
    public static void main(String[] args) {

    // 动态初始化一个数组
    int[] array = new int[3];

        System.out.println(array); // 内存地址值
        System.out.println(array[0]); // 0
        System.out.println(array[1]); // 0
        System.out.println(array[2]); // 0
        System.out.println("=================");

        // Java 不支持一下写法
//        int[] arr2;
//        arr2 = new int[2]{1, 2};

        // 将数据123赋值交给数组array当中的1号元素
        array[1] = 123;
        System.out.println(array[0]); // 0
        System.out.println(array[1]); // 123
        System.out.println(array[2]); // 0
    }
}

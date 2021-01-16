// 500 - 集合_ArrayList的概述和基本使用

/*
    数组的长度不可以发生改变。
    但是ArrayList集合的长度是可以随意变化的。

    对于ArrayList来说，有一个尖括号<E>代表泛型。
    泛型：也就是装在集合当中的所有元素，全都是统一的什么类型。
    注意：泛型只能是引用类型，不能是基本类型。

    注意事项：
    对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
    如果内容是空，得到的是空的中括号：[]
 */

    /*
    ArrayList当中的常用方法有：

        public boolean add(E e)：向集合当中添加元素，参数的类型和泛型一致。返回值代表添加是否成功。
        备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
        但是对于其他集合（今后学习）来说，add添加动作不一定成功。

        public E get(int index)：从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。

        public E remove(int index)：从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。

        public int size()：获取集合的尺寸长度，返回值是集合中包含的元素个数。
 */

import java.util.ArrayList;

public class Demo500ArrayList {
    public static void main(String[] args) {
        // 创建了一个ArrayList集合，集合的名称是list，里面装的全都是String字符串类型的数据
        // 备注：从JDK 1.7+开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写的。
        ArrayList<String> array_list = new ArrayList<>();
        System.out.println(array_list); // []

        // 向集合当中添加一些数据，需要用到add方法。
        array_list.add("Fox");
        System.out.println(array_list); //[Fox]

        array_list.add("Nick");
        array_list.add("Jud");
        System.out.println(array_list); // [Fox, Nick, Jud]

        boolean isSuccess = array_list.add("Yiff");
        System.out.println(isSuccess);

        // 从集合中获取元素：get。索引值从0开始
        String name = array_list.get(2);
        System.out.println("第2号索引位置：" + name); // Juy

        // 从集合中删除元素：remove。索引值从0开始。
        String whoRemoved = array_list.remove(3);
        System.out.println("被删除的人是：" + whoRemoved); // Yiff
        System.out.println(array_list); // [Fox, Nick, Jud]

        // 获取集合的长度尺寸，也就是其中元素的个数
        int size = array_list.size();
        System.out.println("集合的长度是：" + size);
    }
}

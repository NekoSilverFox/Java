
// 501 - 集合_ArrayList存储基本数据类型

/*
    如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”。

    基本类型    包装类（引用类型，包装类都位于java.lang包下）
    byte        Byte
    short       Short
    int         Integer     【特殊】
    long        Long
    float       Float
    double      Double
    char        Character   【特殊】
    boolean     Boolean

    从JDK 1.5+开始，支持自动装箱、自动拆箱。

    自动装箱：基本类型 --> 包装类型
    自动拆箱：包装类型 --> 基本类型
 */

import java.util.ArrayList;

public class Demo501ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> s_list = new ArrayList<>();

        // 错误写法！泛型只能是引用类型，不能是基本类型
//        ArrayList<int> i_list = new ArrayList<>();

        ArrayList<Integer> i_list = new ArrayList<>();
        i_list.add(100);
        i_list.add(200);
        System.out.println(i_list); // [100, 200]

        int num = i_list.get(1);
        System.out.println("第1号元素是：" + num);
    }
}

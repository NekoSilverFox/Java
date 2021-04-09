import java.util.Locale;
import java.util.function.Consumer;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 0:04
 * @Author : NekoSilverfox
 * @FileName: Demo01andThen
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 462 - 函数式接口_andThen(组合)接口
/*
   Consumer接口的默认方法andThen
   作用:需要两个Consumer接口,可以把两个Consumer接口组合到一起,在对数据进行消费

   例如:
    Consumer<String> con1
    Consumer<String> con2
    String s = "hello";
    con1.accept(s);
    con2.accept(s);
    连接两个Consumer接口  再进行消费
    con1.andThen(con2).accept(s); 谁写前边谁先消费
*/
public class Demo01andThen {
    // 定义一个方法,方法的参数传递一个字符串和两个Consumer接口,Consumer接口的泛型使用字符串
    public static void methodAndThen(String str, Consumer<String> con1, Consumer<String> con2) {
/*        con1.accept(str);
        con2.accept(str);*/

        // 使用andThen方法,把两个Consumer接口连接到一起,在消费数据
        con1.andThen(con2).accept(str);  // 效果同上，con1连接con2,先执行con1消费数据,在执行con2消费数据
    }

    public static void main(String[] args) {
        // 调用method方法,传递一个字符串,两个Lambda表达式
        methodAndThen("Silverfox",
                (str)->{
                    // 消费方式:把字符串转换为大写输出
                    System.out.println(str.toUpperCase());
                },
                (str) -> {
                    // 消费方式:把字符串转换为小写输出
                    System.out.println(str.toLowerCase());
                });
    }
}

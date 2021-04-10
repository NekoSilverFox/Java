import java.util.function.Predicate;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/10 18:47
 * @Author : NekoSilverfox
 * @FileName: Demo02Predicate_and
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    需求:判断一个字符串长度是否大于5
        如果字符串的长度大于5,那返回false
        如果字符串的长度不大于5,那么返回true
    所以我们可以使用取反符号!对判断的结果进行取反

    Predicate接口中有一个方法negate,也表示取反的意思
    default Predicate<T> negate() {
        return (t) -> !test(t);
    }
 */
public class Demo04Predicate_negate {
    /*
           定义一个方法,方法的参数,传递一个字符串
           使用Predicate接口判断字符串的长度是否大于5
    */
    public static boolean checkString(String str, Predicate<String> pre) {
        return pre.negate().test(str);  // 等效于return !pre.test(s);等价于return pre1.test(s) && pre2.test(s);
    }

    public static void main(String[] args) {
        String str = "abc";

        boolean result = checkString(str,
                (String s) -> {return !(s.length() > 5);}
                );

        System.out.println(result);
    }
}

// 510 - 集合_String的基本使用

/*
java.lang.String类代表字符串。
API当中说：Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。
其实就是说：程序当中所有的双引号字符串，都是String类的对象。（就算没有new，也照样是。）

字符串的特点：
1. 字符串的内容永不可变。【重点】
2. 正是因为字符串不可改变，所以字符串是可以共享使用的。
3. 字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组。

创建字符串的常见3+1种方式。
三种构造方法：
public String()：创建一个空白字符串，不含有任何内容。
public String(char[] array)：根据字符数组的内容，来创建对应的字符串。
public String(byte[] array)：根据字节数组的内容，来创建对应的字符串。
一种直接创建：
String str = "Hello"; // 右边直接用双引号

注意：直接写上双引号，就是字符串对象。
 */

public class Demo510String {
    public static void main(String[] args) {
        // 使用空参构造
        String str1 = new String();
        System.out.println(str1);

        // 根据字符数组创建字符串
        char[] c_arr = {'a','b', 'c'};
        String str2 = new String(c_arr);
        System.out.println(str2);

        // 使用字节数组创建
        byte[] b_arr = {97,98,99};
        String str3 = new String(b_arr);
        System.out.println(str3);

        // 直接创建
        String str4 = "Hello";
        System.out.println(str4);

        /*
        字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中。

        对于基本类型来说，==是进行数值的比较。
        对于引用类型来说，==是进行【地址值】的比较。
         */
        char[] c_arr_2 = {'c','b','a'};
        String str5 = new String(c_arr_2);
        String str6 = "cba";
        String str7 = "cba";

        System.out.println(str6 == str7); // true
        System.out.println(str6 == str5); // false
    }
}

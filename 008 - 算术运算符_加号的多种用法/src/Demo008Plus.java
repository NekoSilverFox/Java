/*
四则运算中的加号`+`有常见的三种用法
    1. 对于数值，加法
    2. 对于 char 类型来说，在计算前，char 会被提升成为 int，再计算
    *******
    3. 对于字符串 String, （首字母大写，不是关键字）来说，加号代表字符串连接操作
       对于任何数据类型和字符串进行连接的时候，结果都会变成字符串
    *******

 */
public class Demo008Plus {
    public static void main(String[] args) {
        // 字符串类型的基本使用
        String str1 = "Hello";
        System.out.println(str1); // Hello

        System.out.println(str1 + " " + "World!"); // Hello World!

        String str2 = "Java";
        // String + int --> String
        System.out.println(str2 + 20); // Java20

        // 优先级问题
        //    String + int + int
        //--> String       + int
        //--> String
        System.out.println(str2 + 20 + 30); // Java2030

        // 使用括号改变优先级
        System.out.println(str2 + (20 + 30)); // Java50
    }
}

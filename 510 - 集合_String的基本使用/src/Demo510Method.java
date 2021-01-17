public class Demo510Method {
    public static void main(String[] args) {
        ArrListEquals();
    }

    // 字符串的对比
    /*
    ==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：

    public boolean equals(Object obj)：参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true；否则返回false。
    注意事项：
    1. 任何对象都能用Object进行接收。
    2. equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
    3. 如果比较双方一个常量一个变量，推荐把常量字符串写在前面。
    推荐："abc".equals(str)    不推荐：str.equals("abc")

    public boolean equalsIgnoreCase(String str)：忽略大小写，进行内容比较。
     */
    public static void ArrListEquals() {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2)); // true
        System.out.println(str2.equals(str3)); // true
        System.out.println(str3.equals("Hello")); // true
        System.out.println("Hello".equals(str1)); // true

        String str4 = "hello";
        System.out.println(str1.equals(str4)); // false
        System.out.println("=================");

        String str5 = null;
        System.out.println("abc".equals(str5)); // 推荐：false
//        System.out.println(str5.equals("abc")); // 不推荐：报错，空指针异常NullPointerException
        System.out.println("=================");



        /*
         * equalsIgnoreCase
         */
        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB)); // false，严格区分大小写
        System.out.println(strA.equalsIgnoreCase(strB)); // true，忽略大小写

        // 注意，只有英文字母区分大小写，其他都不区分大小写
        System.out.println("abc一123".equalsIgnoreCase("abc壹123")); // false
    }

    /*
    String当中与获取相关的常用方法有：

    public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
    public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。
    public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
    public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
     */
    public static void ArrListMethodGet() {
        // 获取字符串的长度
        int length = "asdasfeutrvauevbueyvb".length();
        System.out.println("字符串的长度是：" + length);

        // 拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1); // Hello，原封不动
        System.out.println(str2); // World，原封不动
        System.out.println(str3); // HelloWorld，新的字符串
        System.out.println("==============");

        // 获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是：" + ch);
        System.out.println("==============");

        // 查找参数字符串在本来字符串当中出现的第一次索引位置
        // 如果根本没有，返回-1值
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次索引值是：" + index); // 2

        System.out.println("HelloWorld".indexOf("abc")); // -1
    }

}

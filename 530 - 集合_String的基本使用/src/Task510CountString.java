import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
题目：
键盘输入一个字符串，并且统计其中各种字符出现的次数。
种类有：大写字母、小写字母、数字、其他

思路：
    1. 既然用到键盘输入，肯定是Scanner
    2. 键盘输入的是字符串，那么：String str = sc.next();
    3. 定义四个变量，分别代表四种字符各自的出现次数。
    4. 需要对字符串一个字、一个字检查，String-->char[]，方法就是toCharArray()
    5. 遍历char[]字符数组，对当前字符的种类进行判断，并且用四个变量进行++动作。
    6. 打印输出四个变量，分别代表四种字符出现次数。
 */
public class Task510CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please in put a string: ");
        String s_input = sc.next();

        int upper_count = 0;
        int lower_count = 0;
        int num_count = 0;
        int other_count = 0;

        char[] char_array = s_input.toCharArray();
        for (char c : char_array) {
            if (c >= 'A' && c <= 'Z') upper_count++;
            else if (c >= 'a' && c <= 'z') lower_count++;
            else if (c >= '0' && c <= '9') num_count++;
            else other_count++;
        }

        System.out.println("大写字母有：" + upper_count);
        System.out.println("小写字母有：" + lower_count);
        System.out.println("数字有：" + num_count);
        System.out.println("其他字符有：" + other_count);
    }
}

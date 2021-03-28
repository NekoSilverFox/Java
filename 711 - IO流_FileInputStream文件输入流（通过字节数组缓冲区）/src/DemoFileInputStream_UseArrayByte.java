import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/28 14:26
 * @Author : NekoSilverfox
 * @FileName: DemoFileInputStream_UseArrayByte
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 711 - IO流_FileInputStream文件输入流（通过字节数组缓冲区）
 */

public class DemoFileInputStream_UseArrayByte {
    public static void main(String[] args) throws IOException {
    /*
        字节输入流一次读取多个字节的方法:
            int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
        明确两件事情:
            1.方法的参数byte[]的作用?
                起到缓冲作用,存储每次读取到的多个字节
                数组的长度一把定义为1024(1kb)或者1024的整数倍
            2.方法的返回值int是什么?
                每次读取的有效字节个数

        String类的构造方法
            String(byte[] bytes) :把字节数组转换为字符串
            String(byte[] bytes, int offset, int length) 把字节数组的一部分转换为字符串 offset:数组的开始索引 length:转换的字节个数
     */
        //  创建FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("710 - IO流_FileInputStream文件输入流\\input\\ifs.txt");

        byte[] buffer_input  = new byte[2];  // 定义一个字符缓冲区
        int read_len = 0;  // 读取到缓冲区的字符数量

        // 使用FileInputStream对象中的方法read读取文件
        // int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中
        read_len = fis.read(buffer_input);
        System.out.println(read_len);  // 2
        System.out.println(Arrays.toString(buffer_input));  // [65, 112]
        System.out.println(new String(buffer_input));  // Ap - 【重点】将字符缓冲区的内容转换为字符串

        System.out.println("================================");

        read_len = fis.read(buffer_input);
        System.out.println(read_len);  // 1
        System.out.println(Arrays.toString(buffer_input));  // [112, 112]
        System.out.println(new String(buffer_input));  // pp - 【重点】将字符缓冲区的内容转换为字符串

        System.out.println("================================");

        read_len = fis.read(buffer_input);
        System.out.println(read_len);  // -1  读不到字符了
        System.out.println(Arrays.toString(buffer_input));  // [112, 112]
        System.out.println(new String(buffer_input));  // pp - 【重点】将字符缓冲区的内容转换为字符串

        // 释放资源
        fis.close();


        System.out.println("===============================");
        /*
            发现以上读取时一个重复的过程,可以使用循环优化
            不知道文件中有多少字节,所以使用while循环
            while循环结束的条件,读取到-1结束
         */
        FileInputStream fis2 = new FileInputStream("710 - IO流_FileInputStream文件输入流\\input\\ifs2.txt");
        byte[] buffer_KB = new byte[1024];  // 缓冲区，存储读取到的多个字节
        read_len = 0;  // 读取到缓冲区的字符数量

        while ((read_len = fis2.read(buffer_KB)) != -1) {
            System.out.print(new String(buffer_KB));
        }

        fis2.close();
    }
}

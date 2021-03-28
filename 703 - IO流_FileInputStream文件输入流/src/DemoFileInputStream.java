import java.io.FileInputStream;
import java.io.IOException;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/28 14:11
 * @Author : NekoSilverfox
 * @FileName: DemoFileInputStream
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 710 - IO流_FileInputStream文件输入流
 */
/*
    java.io.InputStream:字节输入流
    此抽象类是表示字节输入流的所有类的超类。

    定义了所有子类共性的方法:
         int read()从输入流中读取数据的下一个字节。
         int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
         void close() 关闭此输入流并释放与该流关联的所有系统资源。

    java.io.FileInputStream extends InputStream
    FileInputStream:文件字节输入流
    作用:把硬盘文件中的数据,读取到内存中使用

    构造方法:
        FileInputStream(String name)
        FileInputStream(File file)
        参数:读取文件的数据源
            String name:文件的路径
            File file:文件
        构造方法的作用:
            1.会创建一个FileInputStream对象
            2.会把FileInputStream对象指定构造方法中要读取的文件

    读取数据的原理(硬盘-->内存)
        java程序-->JVM-->OS-->OS读取数据的方法-->读取文件

    字节输入流的使用步骤(重点):
        1.创建FileInputStream对象,构造方法中绑定要读取的数据源
        2.使用FileInputStream对象中的方法read,读取文件
        3.释放资源
 */

public class DemoFileInputStream {
    public static void main(String[] args) throws IOException {
        // 1.创建FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("710 - IO流_FileInputStream文件输入流\\input\\ifs.txt");

        // 2.使用FileInputStream对象中的方法read,读取文件
        // int read()读取文件中的一个字节并返回,读取到文件的末尾返回-1
        int len = fis.read();
        System.out.println(len);  // 65 - a

        len = fis.read();
        System.out.println(len);  // 112 - p

        len = fis.read();
        System.out.println(len);  // 112 - p

        len = fis.read();
        System.out.println(len);  // -1（读到文件尾了）

        // 3. 释放资源
        fis.close();


        /*
            发现以上读取文件是一个重复的过程,所以可以使用循环优化
            不知道文件中有多少字节,使用while循环
            while循环结束条件,读取到-1的时候结束

            布尔表达式(len = fis.read())!=-1
                1.fis.read():读取一个字节
                2.len = fis.read():把读取到的字节赋值给变量len，【重点】在read()执行完毕后会将指针指向下一个字节！
                3.(len = fis.read())!=-1:判断变量len是否不等于-1
         */
        FileInputStream fis2 = new FileInputStream("710 - IO流_FileInputStream文件输入流\\input\\ifs2.txt");
        while ((len = fis2.read()) != -1) {
            System.out.print((char) len);  // 转换为char
        }
        fis2.close();
    }
}

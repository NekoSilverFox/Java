import java.io.FileWriter;
import java.io.IOException;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/28 16:32
 * @Author : NekoSilverfox
 * @FileName: DemoFileWriter
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 * 730 - IO流_FileWriter字符输出流
 */
/*
    java.io.Writer:字符输出流,是所有字符输出流的最顶层的父类,是一个抽象类

    共性的成员方法:
        - void write(int c) 写入单个字符。
        - void write(char[] cbuf)写入字符数组。
        - abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        - void write(String str)写入字符串。
        - void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
        - void flush()刷新该流的缓冲。
        - void close() 关闭此流，但要先刷新它。

    java.io.FileWriter extends OutputStreamWriter extends Writer
    FileWriter:文件字符输出流
    作用:把内存中字符数据写入到文件中

    构造方法:
        FileWriter(File file)根据给定的 File 对象构造一个 FileWriter 对象。
        FileWriter(String fileName) 根据给定的文件名构造一个 FileWriter 对象。
        参数:写入数据的目的地
            String fileName:文件的路径
            File file:是一个文件
        构造方法的作用:
            1.会创建一个FileWriter对象
            2.会根据构造方法中传递的文件/文件的路径,创建文件
            3.会把FileWriter对象指向创建好的文件

    字符输出流的使用步骤(重点):
        1.创建FileWriter对象,构造方法中绑定要写入数据的目的地
        2.使用FileWriter中的方法write,把数据写入到内存缓冲区中(字符转换为字节的过程)
        3.使用FileWriter中的方法flush,把内存缓冲区中的数据,刷新到文件中
        4.释放资源(会先把内存缓冲区中的数据刷新到文件中)
 */
public class DemoFileWriter {
    public static void main(String[] args) throws IOException {
        // 1.创建FileWriter对象,构造方法中绑定要写入数据的目的地
        FileWriter fw = new FileWriter("730 - IO流_FileWriter字符输出流\\output.txt");

        // 2.使用FileWriter中的方法write,把数据写入到内存缓冲区中(字符转换为字节的过程)
        // void write(int c) 写入单个字符
        fw.write(97);  // a

        /*
            字符输出流写数据的其他方法
                - void write(char[] cbuf)写入字符数组。
                - abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
                - void write(String str)写入字符串。
                - void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
         */
        char[] c_arr = {'a','b','c','d','e'};
        // void write(char[] cbuf)写入字符数组。
        fw.write(c_arr);  // abcde

        // void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        fw.write(c_arr, 1, 3);  // bcd

        // void write(String str)写入字符串。
        fw.write("咪惹咪惹");

        // void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
        fw.write("冰糖雪狸", 1, 2);  // 糖雪


        // 3.使用FileWriter中的方法flush,把内存缓冲区中的数据,刷新到文件中
        /*
            flush方法和close方法的区别
                - flush ：刷新缓冲区，流对象可以继续使用。
                - close:  先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了。
         */
        fw.flush();

        // 4.释放资源(会先把内存缓冲区中的数据刷新到文件中)
        fw.close();
    }
}

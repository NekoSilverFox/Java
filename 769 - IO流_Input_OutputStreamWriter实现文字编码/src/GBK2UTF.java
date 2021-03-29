import java.io.*;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/29 20:36
 * @Author : NekoSilverfox
 * @FileName: GBK2UTF
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 769 - IO流_Input/OutputStreamWriter实现文字编码
 */
/*
    练习：转换文件编码
        将GBK编码的文本文件，转换为UTF-8编码的文本文件。

    分析:
        1.创建InputStreamReader对象,构造方法中传递字节输入流和指定的编码表名称GBK
        2.创建OutputStreamWriter对象,构造方法中传递字节输出流和指定的编码表名称UTF-8
        3.使用InputStreamReader对象中的方法read读取文件
        4.使用OutputStreamWriter对象中的方法write,把读取的数据写入到文件中
        5.释放资源
 */
public class GBK2UTF {
    public static void main(String[] args) throws IOException {
        // 1.创建InputStreamReader对象,构造方法中传递字节输入流和指定的编码表名称GBK
        InputStreamReader inputStreamReader = new InputStreamReader(
                new FileInputStream("769 - IO流_Input_OutputStreamWriter实现文字编码\\gbk_input.txt"), "GBK");

        // 2.创建OutputStreamWriter对象,构造方法中传递字节输出流和指定的编码表名称UTF-8
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                new FileOutputStream("769 - IO流_Input_OutputStreamWriter实现文字编码\\gbk_output.txt"), "UTF-8");

        char[] chars = new char[1024 * 4];
        int len = 0;
        // 3.使用InputStreamReader对象中的方法read读取文件
        while ((len = inputStreamReader.read(chars)) != -1) {
             // 4.使用OutputStreamWriter对象中的方法write,把读取的数据写入到文件中
            outputStreamWriter.write(chars, 0, len);
        }

        // 5.释放资源
        outputStreamWriter.close();
        inputStreamReader.close();
    }
}

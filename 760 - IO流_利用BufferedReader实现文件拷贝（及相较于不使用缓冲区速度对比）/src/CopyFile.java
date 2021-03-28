import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/28 14:42
 * @Author : NekoSilverfox
 * @FileName: CopyFile
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 * 712 - IO流_实现文件的拷贝（利用Input和OutputStream）
 */
/*
    文件复制练习:一读一写

    文件复制的步骤:
        1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
        2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
        3.使用字节输入流对象中的方法read读取文件
        4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
        5.释放资源
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        long start_time = System.currentTimeMillis();

        // 文件输入、输出
        FileInputStream fis = new FileInputStream("705 - IO流_实现文件的拷贝（利用Input和OutputStream）\\input.png");
        FileOutputStream fos = new FileOutputStream("705 - IO流_实现文件的拷贝（利用Input和OutputStream）\\output.png");

        // 设置字节缓冲区，建议为4KB，因为一个扇叶的大小为4KB
        byte[] buffer = new byte[1024 * 4];

        // 设置读取到的【有效】字节数
        int read_len = 0;

        // 开始读取和写入
        while ((read_len = fis.read(buffer)) != -1) {
//            fos.write(buffer);  【重点】最好不要这么写，因为缓冲区中很可能最后是空白字符或者是其他数据，要用读了对少就写入多少
            fos.write(buffer, 0, read_len);  // 【重点】 只把读取到的有效字节数写入（read_len个字节）
        }  // 拷贝结束，共用时：24ms

        // 释放资源（【重点】先关写的,后关闭读的;如果写完了,肯定读取完毕了）
        fos.close();
        fis.close();

        long end_time = System.currentTimeMillis();
        System.out.println("拷贝结束，共用时：" + (end_time - start_time) + "ms");
    }
}

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/28 23:49
 * @Author : NekoSilverfox
 * @FileName: DemoBufferInputStream
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 755 - IO流_BufferIntputStream字节缓冲输入流
 */
/*
    java.io.BufferedInputStream extends InputStream
    BufferedInputStream:字节缓冲输入流

    继承自父类的成员方法:
        int read()从输入流中读取数据的下一个字节。
        int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
        void close() 关闭此输入流并释放与该流关联的所有系统资源。

    构造方法:
        BufferedInputStream(InputStream in) 创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
        BufferedInputStream(InputStream in, int size) 创建具有指定缓冲区大小的 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
        参数:
            InputStream in:字节输入流
                我们可以传递FileInputStream,缓冲流会给FileInputStream增加一个缓冲区,提高FileInputStream的读取效率
            int size:指定缓冲流内部缓冲区的大小,不指定默认

    使用步骤(重点):
        1.创建FileInputStream对象,构造方法中绑定要读取的数据源
        2.创建BufferedInputStream对象,构造方法中传递FileInputStream对象,提高FileInputStream对象的读取效率
        3.使用BufferedInputStream对象中的方法read,读取文件
        4.释放资源
 */
public class DemoBufferInputStream {
    public static void main(String[] args) throws IOException {
        // 1.创建FileInputStream对象,构造方法中绑定要读取的数据源
        // 2.创建BufferedInputStream对象,构造方法中传递FileInputStream对象,提高FileInputStream对象的读取效率
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("755 - IO流_BufferIntputStream字节缓冲输入流\\input.txt"));

        // 3.使用BufferedInputStream对象中的方法read,读取文件
        // int read()从输入流中读取数据的下一个字节
        /*int len = 0;
        while ((len = bis.read()) != -1) {
            System.out.print((char) len);  // 字节输入流中文乱码
        }*/


        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0 , len));  // 【重点】复习这里，如何将字节数组转为字符串、传递的参数。如果使用String就支持中文了
        }

        // 4.释放资源
        bis.close();
    }
}

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/28 12:56
 * @Author : NekoSilverfox
 * @FileName: DemoFileOutputStream
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 * <p>
 * 700 - IO流_FileOutputStream文件输出流
 */
/*  700 - IO流_FileOutputStream文件输出流
    java.io.OutputStream:字节输出流
        此抽象类是表示输出字节流的所有类的超类。

    定义了一些子类共性的成员方法:
        - public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
        - public void flush() ：刷新此输出流并强制任何缓冲的输出字节被写出。
        - public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
        - public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
        - public abstract void write(int b) ：将指定的字节输出流。

    java.io.FileOutputStream extends OutputStream
    FileOutputStream:文件字节输出流
    作用:把内存中的数据写入到硬盘的文件中

    构造方法:
        FileOutputStream(String name)创建一个向具有指定名称的文件中写入数据的输出文件流。
        FileOutputStream(File file) 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
        参数:写入数据的目的
            String name:目的地是一个文件的路径
            File file:目的地是一个文件
        构造方法的作用:
            1.创建一个FileOutputStream对象
            2.会根据构造方法中传递的文件/文件路径,创建一个空的文件
            3.会把FileOutputStream对象指向创建好的文件

    写入数据的原理(内存-->硬盘)
        java程序-->JVM(java虚拟机)-->OS(操作系统)-->OS调用写数据的方法-->把数据写入到文件中

    字节输出流的使用步骤(重点):
        1.创建一个FileOutputStream对象,构造方法中传递写入数据的目的地
        2.调用FileOutputStream对象中的方法write,把数据写入到文件中
        3.释放资源(流使用会占用一定的内存,使用完毕要把内存清空,提供程序的效率)
 */
public class DemoFileOutputStream {
    public static void main(String[] args) throws IOException {
        // 1.创建一个FileOutputStream对象,构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream("700 - IO流_FileOutputStream文件输出流\\output\\fos1.txt");  // 路径错误会抛出 java.io.FileNotFoundException 异常

        // 2.调用FileOutputStream对象中的方法write,把数据写入到文件中
        // public abstract void write(int b) ：将指定的字节输出流。
        fos.write(97);  // 这里写入的是字母 `a`，因为 fos.write() 方法写入的是字节流，我不是字符流
        fos.write(98); // 写出第2个字节
        fos.write(99); // 写出第3个字节  ==》 文件内容：abc

        // 3.释放资源(流使用会占用一定的内存,使用完毕要把内存清空,提供程序的效率)
        fos.close();


        /** 一次写入多个字节（使用字节数组） *********************************************************************************
         *  一次写多个字节的方法:
         *     - public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
         *     - public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
         * ***********************************************************************************************************/
        // 创建FileOutputStream对象,构造方法中绑定要写入数据的目的地
        FileOutputStream fos2 = new FileOutputStream("700 - IO流_FileOutputStream文件输出流\\output\\fos2.txt");
        /*
            public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
            一次写多个字节:
                如果写的第一个字节是正数(0-127),那么显示的时候会查询ASCII表
                如果写的第一个字节是负数,那第一个字节会和第二个字节,两个字节组成一个中文显示,查询系统默认码表(GBK)
         */
        byte[] arr_byte = {65, 66, 67, 68, 69};  // ABCDE
//        byte[] arr_byte = {-65,-66,-67,68,69};  // 烤紻E
        fos2.write(arr_byte);


        /*
            public void write(byte[] b, int off, int len) ：把字节数组的一部分写入到文件中
                int off:数组的开始索引
                int len:写几个字节
         */
        fos2.write(arr_byte, 1, 3);  // 追加 BCD


        /*
            写入字符的方法:可以使用String类中的方法把字符串,转换为字节数组
                byte[] getBytes()  把字符串转换为字节数组
         */
        byte[] arr_byte2 = "惹惹惹".getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(arr_byte2));  // [-26, -125, -71, -26, -125, -71, -26, -125, -71]
        fos2.write(arr_byte2);


        // 释放资源
        fos2.close();




        /** 追加、续写的方式打开文件 *********************************************************************************
         *  追加写/续写:使用两个参数的构造方法
         *     FileOutputStream(String name, boolean append)创建一个向具有指定 name 的文件中写入数据的输出文件流。
         *     FileOutputStream(File file, boolean append) 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
         *     参数:
         *        String name,File file:写入数据的目的地
         *        boolean append:追加写开关
         *         true:创建对象不会覆盖源文件,继续在文件的末尾追加写数据
         *         false:创建一个新文件,覆盖源文件
         * 写换行:写换行符号
         *     windows:\r\n
         *     linux:/n
         *     mac:/r
         * ***********************************************************************************************************/
         FileOutputStream fos3 = new FileOutputStream("700 - IO流_FileOutputStream文件输出流\\output\\fos3.txt", true);
         for (int i = 0; i < 10; i ++) {
             fos3.write("你好哦".getBytes(StandardCharsets.UTF_8));
             fos3.write("\n".getBytes(StandardCharsets.UTF_8));  // 这里用 \r\n 和 \n 的效果一样
         }
         fos3.close();
    }
}

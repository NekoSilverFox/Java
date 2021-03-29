import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/29 22:30
 * @Author : NekoSilverfox
 * @FileName: DemoPrintStream
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 * 780 - IO流_PrintStream打印流
 */
/*
    java.io.PrintStream:打印流
        PrintStream 为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式。
    PrintStream特点:
        1.只负责数据的输出,不负责数据的读取
        2.与其他输出流不同，PrintStream 永远不会抛出 IOException
        3.有特有的方法,print,println
            void print(任意类型的值)
            void println(任意类型的值并换行)
    构造方法:
        PrintStream(File file):输出的目的地是一个文件
        PrintStream(OutputStream out):输出的目的地是一个字节输出流
        PrintStream(String fileName) :输出的目的地是一个文件路径
    PrintStream extends OutputStream
    继承自父类的成员方法:
        - public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
        - public void flush() ：刷新此输出流并强制任何缓冲的输出字节被写出。
        - public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
        - public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
        - public abstract void write(int b) ：将指定的字节输出流。
    注意:
        如果使用继承自父类的write方法写数据,那么查看数据的时候会查询编码表 97->a
        如果使用自己特有的方法print/println方法写数据,写的数据原样输出 97->97
 */
public class DemoPrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        // 创建打印流PrintStream对象,构造方法中绑定要输出的目的地
        PrintStream printStream = new PrintStream("780 - IO流_PrintStream打印流\\output.txt");

        // 如果使用继承自父类的write方法写数据,那么查看数据的时候会查询编码表 97->a
        printStream.write(97);  // a

        // 如果使用自己特有的方法print/println方法写数据,写的数据原样输出 97->97
        printStream.println(97);
        printStream.println(6.6);
        printStream.println(true);
        printStream.println("冰糖雪狸");
        printStream.println('Ш');

        // 释放资源
        printStream.close();




        /*
            可以改变输出语句的目的地(打印流的流向)
            输出语句,默认在控制台输出
            使用System.setOut方法改变输出语句的目的地改为参数中传递的打印流的目的地
                static void setOut(PrintStream out)
                  重新分配“标准”输出流。
         */
        System.out.println("我是在控制台输出的！");

        PrintStream printStream2 = new PrintStream("780 - IO流_PrintStream打印流\\output.txt");
        System.setOut(printStream2);  // 【重点】把输出语句的目的地改变为打印流的目的地
        System.out.println("我在打印流的目的地中输出");

        printStream2.close();
    }
}

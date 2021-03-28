import java.io.*;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/28 21:58
 * @Author : NekoSilverfox
 * @FileName: DemoJDK9
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 742 - IO流_JDK9处理流中异常
 */
/*
    JDK9新特性
    try的前边可以定义流对象
    在try后边的()中可以直接引入流对象的名称(变量名)
    在try代码执行完毕之后,流对象也可以释放掉,不用写finally
    格式:
        A a = new A();
        B b = new B();
        try(a,b){
            可能会产出异常的代码
        }catch(异常类变量 变量名){
            异常的处理逻辑
        }
 */
public class DemoJDK9 {
    public static void main(String[] args) throws FileNotFoundException {
        long start_time = System.currentTimeMillis();

        // 文件输入、输出
        FileInputStream fis = new FileInputStream("712 - IO流_实现文件的拷贝（利用Input和OutputStream）\\input.png");
        FileOutputStream fos = new FileOutputStream("712 - IO流_实现文件的拷贝（利用Input和OutputStream）\\output.png");

        // 设置字节缓冲区，建议为4KB，因为一个扇叶的大小为4KB
        byte[] buffer = new byte[1024 * 4];

        // 设置读取到的【有效】字节数
        int read_len = 0;




        try (fis; fos){
            // 开始读取和写入
            while ((read_len = fis.read(buffer)) != -1) {
    //            fos.write(buffer);  【重点】最好不要这么写，因为缓冲区中很可能最后是空白字符或者是其他数据，要用读了对少就写入多少
                fos.write(buffer, 0, read_len);  // 【重点】 只把读取到的有效字节数写入（read_len个字节）
            }
        } catch (IOException e) {
            System.out.println(e);
        }






//        // 释放资源（【重点】先关写的,后关闭读的;如果写完了,肯定读取完毕了）
//        fos.close();
//        fis.close();  因为如果有异常会自动释放资源，所以不需要释放了

        long end_time = System.currentTimeMillis();
        System.out.println("拷贝结束，共用时：" + (end_time - start_time) + "ms");
    }
}

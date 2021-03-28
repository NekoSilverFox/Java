import java.io.*;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/29 0:43
 * @Author : NekoSilverfox
 * @FileName: BufferedCopy
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 * 760 - IO流_利用BufferedReader实现文件拷贝（及相较于不使用缓冲区速度对比）
 */

public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        long start_time = System.currentTimeMillis();

        // 创建输入输出的Buffer
        // 【重点】最好要用字节输入流，而不是字符输入流。不要再搞错了。经测试，虽然字符一次性读入的数据多，但是反而更慢了
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("fileForTest\\input.png"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("fileForTest\\output.png"));

        // 使用单字节读入和写入
/*        int len = 0;
        while ((len = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(len);
        }  // 拷贝结束，共用时：141ms，明显比不使用Buffered缓冲区大（快了将近300倍）！*/


        // 使用数组缓冲读取多个字节,写入多个字节
        int len = 0;
        byte[] buffer_arr = new byte[1024 * 4];
        while ((len = bufferedInputStream.read(buffer_arr)) != -1) {
            bufferedOutputStream.write(buffer_arr, 0, len);
        }  // 拷贝结束，共用时：16ms


        // 释放资源（先关写的,后关闭读的;如果写完了,肯定读取完毕了）
        bufferedOutputStream.close();
        bufferedInputStream.close();

        long end_time = System.currentTimeMillis();
        System.out.println("拷贝结束，共用时：" + (end_time - start_time) + "ms");
    }
}

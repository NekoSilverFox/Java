import java.io.FileReader;
import java.io.IOException;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/29 20:02
 * @Author : NekoSilverfox
 * @FileName: DemoGBK_UTF_8
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 721 - IO流_FileReader字符输入流的读取（文件编码问题）
 */
/*
    FileReader可以读取IDE默认编码格式(UTF-8)的文件
    FileReader读取系统默认编码(中文GBK)会产生乱码���
 */
public class DemoGBK_UTF_8 {
    public static void main(String[] args) throws IOException {
        FileReader fr_GBK = new FileReader("721 - IO流_FileReader字符输入流的读取（文件编码问题）\\GBKInput.txt");
        FileReader fr_UTF_8 = new FileReader("721 - IO流_FileReader字符输入流的读取（文件编码问题）\\UTF8Input.txt");

        int len = 0;
//        while ((len = fr_GBK.read()) != -1) {
        while ((len = fr_UTF_8.read()) != -1) {
            System.out.print((char) len);
        }

        fr_GBK.close();
        fr_UTF_8.close();
    }
}

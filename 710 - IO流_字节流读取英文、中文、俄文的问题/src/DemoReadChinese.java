import java.io.FileInputStream;
import java.io.IOException;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/28 15:39
 * @Author : NekoSilverfox
 * @FileName: DemoReadChinese
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    使用字节流读取中文文件
    1个中文
        GBK:占用两个字节
        UTF-8:占用3个字节

    【注意】FileInputStream或者FileOutputStream读取或写入的是【字符】流，一次读取的是一个或多个字节
 */
public class DemoReadChinese {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("713 - IO流_字节流读取英文、中文、俄文的问题\\input.txt");
        int len = 0;

        while ((len = fis.read()) != -1) {
//            System.out.println(len);
            System.out.println((char) len);  // 英文争正常，中文和俄文乱码
        }

        fis.close();
    }
}

import java.io.FileWriter;
import java.io.IOException;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/28 16:42
 * @Author : NekoSilverfox
 * @FileName: DemoFileWriterAppend
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    续写和换行
    续写,追加写:使用两个参数的构造方法
        FileWriter(String fileName, boolean append)
        FileWriter(File file, boolean append)
        参数:
            String fileName,File file:写入数据的目的地
            boolean append:续写开关 true:不会创建新的文件覆盖源文件,可以续写; false:创建新的文件覆盖源文件
     换行:换行符号
        windows:\r\n
        linux:/n
        mac:/r
 */
public class DemoFileWriterAppend {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("730 - IO流_FileWriter字符输出流\\outputAppend.txt", true);  // true 代表可以续写，和OutputStream一样

        for (int i = 0; i < 10; i++) {
            fw.write("冰糖雪狸" + i + "\r\n");
        }

        // 在关闭的同时会把缓冲区的内容写入到文件中
        fw.close();
    }
}

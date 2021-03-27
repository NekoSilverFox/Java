import java.io.File;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/27 11:43
 * @Author : NekoSilverfox
 * @FileName: DemoFile
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 255 - API_File类
 */
/*
    java.io.File类
    文件和目录路径名的抽象表示形式。
    java把电脑中的文件和文件夹(目录)封装为了一个File类,我们可以使用File类对文件和文件夹进行操作
    我们可以使用File类的方法
        创建一个文件/文件夹
        删除文件/文件夹
        获取文件/文件夹
        判断文件/文件夹是否存在
        对文件夹进行遍历
        获取文件的大小
    File类是一个与系统无关的类,任何的操作系统都可以使用这个类中的方法

    重点:记住这三个单词
        file:文件
        directory:文件夹/目录
        path:路径

        static String pathSeparator 与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
        static char pathSeparatorChar 与系统有关的路径分隔符。
        static String separator 与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
        static char separatorChar 与系统有关的默认名称分隔符。

        【重点】操作路径:路径不能写死了
        C:\develop\a\a.txt  windows
        C:/develop/a/a.txt  linux
        "C:"+File.separator+"develop"+File.separator+"a"+File.separator+"a.txt"
 */

public class DemoFile {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator; // 路径分隔符 windows:分号;  linux:冒号:
        System.out.println("File.pathSeparator: " + pathSeparator);

        String separator = File.separator; //  文件名称分隔符 windows:反斜杠\  linux:正斜杠/
        System.out.println("File.separator: " + separator);

        /*
    路径:
        绝对路径:是一个完整的路径
            以盘符(c:,D:)开始的路径
                c:\\a.txt
                C:\\Users\itcast\\IdeaProjects\\shungyuan\\123.txt
                D:\\demo\\b.txt
        相对路径:是一个简化的路径
            相对指的是相对于当前项目的根目录(C:\\Users\itcast\\IdeaProjects\\shungyuan)
            如果使用当前项目的根目录,路径可以简化书写
            C:\\Users\itcast\\IdeaProjects\\shungyuan\\123.txt-->简化为: 123.txt(可以省略项目的根目录)
        注意:
            1.路径是不区分大小写
            2.路径中的文件名称分隔符windows使用反斜杠,反斜杠是转义字符,两个反斜杠代表一个普通的反斜杠
     */
        File f1 = new File("C:\\Users\\mi\\Desktop\\Programma\\Java");
        long length_f1 = f1.length();
        System.out.println("f1.length(): " + length_f1);  // 65536 返回这个抽象路径名所表示的文件的长度。如果这个路径名表示的是一个目录，则返回值不指定。


    }

}

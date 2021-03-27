import java.io.File;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/27 13:41
 * @Author : NekoSilverfox
 * @FileName: DemoJudgeMethod
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoJudgeMethod {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\mi\\Desktop\\Programma\\Java\\255 - API_File类\\src");
        File f2 = new File("call.png");
        File f3 = new File("C:\\Users\\mi\\Desktop\\Program");

        /*
            public boolean exists() ：此File表示的文件或目录是否实际存在。
            用于判断构造方法中的路径是否存在
                存在:true
                不存在:false
         */
        System.out.println("f1.exists(): " + f1.exists());  // true
        System.out.println("f2.exists(): " + f2.exists());  // true
        System.out.println("f3.exists(): " + f3.exists());  // false

        /*
            public boolean isDirectory() ：此File表示的是否为目录。
                用于判断构造方法中给定的路径是否以文件夹结尾
                    是:true
                    否:false
            public boolean isFile() ：此File表示的是否为文件。
                用于判断构造方法中给定的路径是否以文件结尾
                    是:true
                    否:false
            注意:
                电脑的硬盘中只有文件/文件夹,两个方法是互斥
                这两个方法使用前提,路径必须是存在的,否则都返回false
         */
        System.out.println("f1.isDirectory(): " + f1.isDirectory());  // true
        System.out.println("f2.isDirectory(): " + f2.isDirectory());  // false
        System.out.println("f3.isDirectory(): " + f3.isDirectory());  // false 不存在

        System.out.println("f1.isFile(): " + f1.isFile());  // false
        System.out.println("f2.isFile(): " + f2.isFile());  // true
        System.out.println("f3.isFile(): " + f3.isFile());  // false  不存在


        // exists() 和 isDirectory()、isFile() 配合使用
        whichType(f1);
        whichType(f2);
        whichType(f3);
    }

    // exists() 和 isDirectory()、isFile() 配合使用
    public static void whichType(File path) {
        if (path.exists()) {
            if (path.isDirectory()) {
                System.out.println("这是一个文件夹");
            }
            if (path.isFile()) {
                System.out.println("这是一个文件，大小为：" + path.length());
            }
        } else {
            System.out.println("文件/文件夹不存在！");
        }
    }
}

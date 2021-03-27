import java.io.File;
import java.io.IOException;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/27 15:12
 * @Author : NekoSilverfox
 * @FileName: DemoCreateDeleteFileAndDir
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    File类创建删除功能的方法
        - public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        - public boolean delete() ：删除由此File表示的文件或目录。
        - public boolean mkdir() ：创建由此File表示的目录。
        - public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
 */
public class DemoCreateDeleteFileAndDir {
    public static void main(String[] args) throws IOException {
    /*
        public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        创建文件的路径和名称在构造方法中给出(构造方法的参数)
        返回值:布尔值
            true:文件不存在,创建文件,返回true
            false:文件存在,不会创建,返回false
        注意:
            1.此方法只能创建文件,不能创建文件夹
            2.创建文件的路径必须存在,否则会抛出异常

        public boolean createNewFile() throws IOException
        createNewFile声明抛出了IOException,我们调用这个方法,就必须的处理这个异常,要么throws,要么trycatch
     */
        File f1 = new File("C:\\Users\\mi\\Desktop\\Programma\\Java\\255 - API_File类\\f1.txt");
        boolean isSucc = f1.createNewFile();
        System.out.println("f1.createNewFile(): " + isSucc);// true

        File f2 = new File("C:\\Users\\mi\\Desktop\\Programma\\Java\\25\\f1.txt");
//        System.out.println("f2.createNewFile(): " + f2.createNewFile());  // 路径不存在,抛出IOException



    /*
       public boolean mkdir() ：创建单级空文件夹
       public boolean mkdirs() ：既可以创建单级空文件夹,也可以创建多级文件夹
       创建文件夹的路径和名称在构造方法中给出(构造方法的参数)
        返回值:布尔值
            true:文件夹不存在,创建文件夹,返回true
            false:【文件夹存在】,不会创建,返回false;构造方法中给出的路径不存在返回false
        注意:
            1.此方法只能创建文件夹,不能创建文件
     */
        File d1 = new File("C:\\Users\\mi\\Desktop\\Programma\\Java\\255 - API_File类\\OwO");
        System.out.println("d1.mkdir(): " + d1.mkdir());  // true

        File d2 = new File("C:\\Users\\mi\\Desktop\\Programma\\Java\\255 - API_File类\\1\\2\\3\\4\\5\\6\\7\\8");
        System.out.println("d2.mkdir(): " + d2.mkdirs());  // true  注意：创建多级目录用的是 mkdirS

        File d3 = new File("25\\1128");  // 相对路径
        System.out.println("d3.mkdir(): " + d3.mkdirs());  // 创建了，但是在老师的案例中是：不会抛出异常,路径不存在,不会创建


    /*
        public boolean delete() ：删除由此File表示的文件或目录。
        此方法,可以删除构造方法路径中给出的文件/文件夹
        返回值:布尔值
            true:文件/文件夹删除成功,返回true
            false:文件夹中有内容,不会删除返回false; 构造方法中路径不存在false
        注意:
            delete方法是直接在硬盘删除文件/文件夹,不走回收站,删除要谨慎
     */
        File dele1 = new File("C:\\Users\\mi\\Desktop\\Programma\\Java\\255 - API_File类\\OwO");
        System.out.println("dele1.delete(): " + dele1.delete());  // true

        File dele2 = new File("C:\\Users\\mi\\Desktop\\Programma\\Java\\255 - API_File类\\1");
        System.out.println("dele2.delete(): " + dele2.delete());  // false  文件夹中有内容,不会删除返回false
    }
}

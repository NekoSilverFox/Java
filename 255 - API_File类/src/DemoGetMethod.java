import java.io.File;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/27 13:10
 * @Author : NekoSilverfox
 * @FileName: DemoGetMethod
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoGetMethod {
    public static void main(String[] args) {
        // 创建两个文件对象
        File f1 = new File("C:\\Users\\mi\\Desktop\\Programma\\Java\\255 - API_File类\\src");
        File f2 = new File("call.png");
        File f3 = new File(".");
        System.out.println("当前相对路径：" + f3.getAbsolutePath());  // C:\Users\mi\Desktop\Programma\Java\.

    /*
        public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        获取的构造方法中传递的路径
        【无论路径是绝对的还是相对的,getAbsolutePath方法返回的都是绝对路径】
     */
        String absolutePath_f1 = f1.getAbsolutePath();
        System.out.println("absolutePath_f1: " + absolutePath_f1);  // C:\Users\mi\Desktop\Programma\Java\255 - API_File类\src

        String absolutePath_f2 = f2.getAbsolutePath();
        System.out.println("absolutePath_f2: " + absolutePath_f2);  // C:\Users\mi\Desktop\Programma\Java\call.png


            /*
        public String getPath() ：将此File转换为路径名字符串。
        获取的构造方法中传递的路径

        toString方法调用的就是getPath方法
        源码:
            public String toString() {
                return getPath();
            }
        */
        System.out.println("f1.getPath()： " + f1.getPath());  // C:\Users\mi\Desktop\Programma\Java\255 - API_File类\src
        System.out.println("f1.toString(): " + f1.toString());  // C:\Users\mi\Desktop\Programma\Java\255 - API_File类\src

        System.out.println("f2.getPath()： " + f2.getPath());  // call.png
        System.out.println("f2.toString(): " + f2.toString());  // call.png


        /*
            public String getName()  ：返回由此File表示的文件或目录的名称。
            获取的就是构造方法传递路径的【结尾部分】(文件/文件夹)
        */
        System.out.println("f1.getName: " + f1.getName());  // src
        System.out.println("f2.getName: " + f2.getName());  // call.png


        /*
            public long length()  ：返回由此File表示的文件的长度。
            获取的是构造方法指定的文件的大小,以【字节】为单位
            注意:
                文件夹是没有大小概念的,不能获取文件夹的大小
                如果构造方法中给出的路径不存在,那么length方法返回0
        */
        System.out.println("f1.length(): " + f1.length());  // 4096 ?????【为什么】是不是因为是一个基本的文件块大小？或者扇区大小？
        System.out.println("f2.length(): " + f2.length());  // 107634 B
    }
}

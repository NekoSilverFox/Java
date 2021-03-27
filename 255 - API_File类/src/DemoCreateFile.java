import java.io.File;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/27 12:57
 * @Author : NekoSilverfox
 * @FileName: DemoCreateFile
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoCreateFile {
    public static void main(String[] args) {
      /*
        File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
        参数:
            String pathname:字符串的路径名称
            路径可以是以文件结尾,也可以是以文件夹结尾
            路径可以是相对路径,也可以是绝对路径
            路径可以是存在,也可以是不存在
            创建File对象,只是把字符串路径封装为File对象,不考虑路径的真假情况
     */
        File f1 = new File("C:\\Users\\mi\\Desktop\\Programma\\Java\\255 - API_File类\\src");
        System.out.println("f1: " + f1);  // 重写了Object类的toString方法 C:\Users\mi\Desktop\Programma\Java\255 - API_File类\src

        File f2 = new File("call.png");
        System.out.println("f2: " + f2);  // call.png


        /*
        File(String parent, String child) 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
        参数:把路径分成了两部分
            String parent:父路径
            String child:子路径
        好处:
            父路径和子路径,可以单独书写,使用起来非常灵活;父路径和子路径都可以变化
     */
        File f3 = new File("C:\\Users\\mi\\Desktop\\Programma\\Java\\255 - API_File类\\src", "call.png");
        System.out.println("f3: " + f3);  // C:\Users\mi\Desktop\Programma\Java\255 - API_File类\src\call.png


        /*
        File(File parent, String child) 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
        参数:把路径分成了两部分
            【File】 parent:父路径
            String child:子路径
        好处:
             父路径和子路径,可以单独书写,使用起来非常灵活;父路径和子路径都可以变化
             父路径是File类型,可以使用File的方法对路径进行一些操作,再使用路径创建对象
        */
        File parent = new File("C:\\Users\\mi\\Desktop\\Programma\\Java\\255 - API_File类\\src");
        File f4 = new File(parent, "call.png");
        System.out.println("f4: " + f4);  // C:\Users\mi\Desktop\Programma\Java\255 - API_File类\src\call.png

    }
}

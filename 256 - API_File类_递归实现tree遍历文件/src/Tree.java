import java.io.File;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/27 17:26
 * @Author : NekoSilverfox
 * @FileName: Tree
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class Tree {
    public static void main(String[] args) {
//        File path = new File("C:\\Users\\mi\\Desktop\\Programma\\Java\\255 - API_File类");
        File path = new File("C:\\Users\\mi\\Desktop\\Programma\\Java");
        tree(path, 0);
    }

    public static void tree(File path, int num) {
        File[] files = path.listFiles();

        for (File ele : files) {
            String str_path = ele.getName();

            if (ele.isDirectory()) {
                printSpace(num);
                System.out.println("┗" + str_path);
                tree(ele, ++num);
            } else {
                printSpace(num);
                System.out.println("┗" + str_path);
            }

        }
    }

    public static void printSpace(int num) {
//        System.out.print("┃");
        for (int i = 0; i < num; i++) {
            System.out.print(" ");
        }
    }

    /*
    定义一个方法,参数传递File类型的目录
    方法中对目录进行遍历
 */
    public static void getAllFile(File dir){
        System.out.println(dir);//打印被遍历的目录名称
        File[] files = dir.listFiles();
        for (File f : files) {
            //对遍历得到的File对象f进行判断,判断是否是文件夹
            if(f.isDirectory()){
                //f是一个文件夹,则继续遍历这个文件夹
                //我们发现getAllFile方法就是传递文件夹,遍历文件夹的方法
                //所以直接调用getAllFile方法即可:递归(自己调用自己)
                getAllFile(f);
            }else{
                //f是一个文件,直接打印即可
                System.out.println(f);
            }
        }
    }
}

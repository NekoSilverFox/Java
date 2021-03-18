import java.io.IOException;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/18 20:22
 * @Author : NekoSilverfox
 * @FileName: DemoTryCatch
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    try...catch:异常处理的第二种方式,自己处理异常
    格式:
        try{
            可能产生异常的代码
        }catch(定义一个异常的变量,用来接收try中抛出的异常对象){
            异常的处理逻辑,异常异常对象之后,怎么处理异常对象
            一般在工作中,会把异常的信息记录到一个日志中
        }
        ...
        catch(异常类名 变量名){

        }
    注意: 【重点】
        1.try中可能会抛出多个异常对象,那么就可以使用多个catch来处理这些异常对象
        2.如果try中产生了异常,那么就会执行catch中的异常处理逻辑,执行完毕catch中的处理逻辑,继续执行try...catch之后的代码
          如果try中没有产生异常,那么就不会执行catch中异常的处理逻辑,执行完try中的代码,继续执行try...catch之后的代码
 */
public class DemoTryCatch {
    public static void main(String[] args) {
        try {
            // 产生异常的代码
            readFile("C:\\a.t");
        } catch (IOException e) {  //try中抛出什么异常对象,catch就定义什么异常变量,用来接收这个异常对象
            /*
                Throwable类中定义了3个异常处理的方法
                 String getMessage() 返回此 throwable 的简短描述。
                 String toString() 返回此 throwable 的详细消息字符串，和直接打印异常是一样的（因为是toString方法）。
                 void printStackTrace()  JVM打印异常对象,默认此方法,打印的异常信息是最全面的
             */
            System.out.println(e.getMessage());  // 文件的后缀名不对
            System.out.println(e.toString());  // java.io.IOException: 文件的后缀名不对
            System.out.println(e);  // java.io.IOException: 文件的后缀名不对
            e.fillInStackTrace();  /**java.io.IOException: 文件的后缀名不对
                                        at DemoTryCatch.main(DemoTryCatch.java:46)*/

            e.printStackTrace();  /** java.io.IOException: 文件的后缀名不对
                                          at DemoTryCatch.readFile(DemoTryCatch.java:57)
                                          at DemoTryCatch.main(DemoTryCatch.java:35)
                                      */
        }
        // 【重点】如果是编译期异常，那么在异常的抛出后，程序依然可以向下执行
        //       而如果是运行期异常，那么异常在由JVM处理后会发生中断，自己catch不会中断
        System.out.println("main函数最后的异常");
    }

    /*
   如果传递的路径,不是.txt结尾
   那么我们就抛出IO异常对象,告知方法的调用者,文件的后缀名不对
    */
    public static void readFile(String fileName) throws IOException {

        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }

        System.out.println("路径没有问题,读取文件");
    }
}

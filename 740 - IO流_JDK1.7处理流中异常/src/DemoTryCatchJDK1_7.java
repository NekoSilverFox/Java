import java.io.FileWriter;
import java.io.IOException;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/28 19:08
 * @Author : NekoSilverfox
 * @FileName: DemoTryCatchJDK1_7
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 740 - IO流_JDK1.7处理流中异常
 */
/*
    在jdk1.7之前使用try catch finally 处理流中的异常
    格式:
        try{
            可能会产出异常的代码
        }catch(异常类变量 变量名){
            异常的处理逻辑
        }finally{
            一定会指定的代码
            资源释放
        }
 */
public class DemoTryCatchJDK1_7 {
    public static void main(String[] args) {
        // 提高变量fw的作用域,让finally可以使用
        // 变量在定义的时候,可以没有值,但是使用的时候必须有值
        FileWriter fw = null;
        try {
            // 可能会产出异常的代码
            fw = new FileWriter("E:\\740 - IO流_JDK1.7处理流中异常\\output.txt");

            for (int i = 0; i < 10; i++) {
                fw.write("Hello " + i + "\n");
            }
        } catch (IOException exception) {
            System.out.println(exception);
        } finally {
            // 一定会指定的代码
            // 创建对象失败了,fw的默认值就是null,null是不能调用方法的,会抛出NullPointerException,需要增加一个判断,不是null在把资源释放
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException exception) {
                    System.out.println(exception);
                }
            }
        }
    }
}

import java.io.FileWriter;
import java.io.IOException;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/28 21:54
 * @Author : NekoSilverfox
 * @FileName: DemoIOStreamExceptionJDK7
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 * 741 - IO流_JDK7处理流中异常
 */
/*
    JDK7的新特性【重点】
    在try的后边可以增加一个(),在括号中可以定义流对象
    那么这个流对象的作用域就在try中有效
    try中的代码执行完毕,会自动把流对象释放,不用写finally
    格式:
        try(定义流对象;定义流对象....){
            可能会产出异常的代码
        }catch(异常类变量 变量名){
            异常的处理逻辑
        }
 */
public class DemoIOStreamExceptionJDK7 {
    public static void main(String[] args) {
        try (   // JDK 7 中把流的定义放在try的括号中，如果有异常会自动释放；所以不用写close了
                FileWriter fw = new FileWriter("741 - IO流_JDK7处理流中异常\\output.txt")
            )
        {
            fw.write("冰糖雪狸");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

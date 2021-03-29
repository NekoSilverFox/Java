import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/29 21:18
 * @Author : NekoSilverfox
 * @FileName: DemoObjectOutputStream
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 711 - IO流_ObjectOutputStream对象的序列化流
 */
/*
    java.io.ObjectOutputStream extends OutputStream
    ObjectOutputStream:对象的序列化流
    作用:把对象以流的方式写入到文件中保存

    构造方法:
        ObjectOutputStream(OutputStream out) 创建写入指定 OutputStream 的 ObjectOutputStream。
        参数:
            OutputStream out:字节输出流
    特有的成员方法:
        void writeObject(Object obj) 将指定的对象写入 ObjectOutputStream。

    使用步骤:
        1.创建ObjectOutputStream对象,构造方法中传递字节输出流
        2.使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
        3.释放资源
 */
public class DemoObjectOutputStream {
    public static void main(String[] args) throws IOException {
        // 1.创建ObjectOutputStream对象,构造方法中传递字节输出流
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("711 - IO流_ObjectOutputStream对象的序列化流\\person.txt"));

        // 2.使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
        objectOutputStream.writeObject(new Person("冰糖雪狸", 17));

        // 3.释放资源
        objectOutputStream.close();
    }
}

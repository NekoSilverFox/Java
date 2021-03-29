import java.io.*;
import java.util.ArrayList;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/29 21:54
 * @Author : NekoSilverfox
 * @FileName: DemoObjectStream
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 715 - IO流_ObjectInput-OutputStream序列化流练习（存储多个对象）
 */
/*
    练习：序列化集合
        当我们想在文件中保存多个对象的时候
        可以把多个对象存储到一个集合中
        对集合进序列化和反序列化
    分析:
        1.定义一个存储Person对象的ArrayList集合
        2.往ArrayList集合中存储Person对象
        3.创建一个序列化流ObjectOutputStream对象
        4.使用ObjectOutputStream对象中的方法writeObject,对集合进行序列化
        5.创建一个反序列化ObjectInputStream对象
        6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
        7.把Object类型的集合转换为ArrayList类型
        8.遍历ArrayList集合
        9.释放资源
 */

public class DemoObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1.定义一个存储Person对象的ArrayList集合
        ArrayList<Person> personArrayList = new ArrayList<>();

        // 2.往ArrayList集合中存储Person对象
        personArrayList.add(new Person("Silverfox", 17));
        personArrayList.add(new Person("RedFox", 16));
        personArrayList.add(new Person("Cat", 18));
        personArrayList.add(new Person("Wolf", 19));

        // 3.创建一个序列化流ObjectOutputStream对象
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("715 - IO流_ObjectInput-OutputStream序列化流练习（存储多个对象）\\personArrayList.txt")
        );

        // 4.使用ObjectOutputStream对象中的方法writeObject,对集合进行序列化
        objectOutputStream.writeObject(personArrayList);

        // 5.创建一个反序列化ObjectInputStream对象
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("715 - IO流_ObjectInput-OutputStream序列化流练习（存储多个对象）\\personArrayList.txt")
        );

        // 6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
        Object readObject = objectInputStream.readObject();

        // 7.把Object类型的集合转换为ArrayList类型
        ArrayList<Person> readPersonList = (ArrayList<Person>)readObject;

        // 8.遍历ArrayList集合
        for (Person person : readPersonList) {
            System.out.println(readPersonList);
        }

        // 9.释放资源
        objectOutputStream.close();
        objectInputStream.close();
    }
}

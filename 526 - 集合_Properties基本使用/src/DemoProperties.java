import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/28 22:12
 * @Author : NekoSilverfox
 * @FileName: DemoProperties
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 526 - 集合_Properties基本使用
 */
/*
    java.util.Properties集合 extends Hashtable<k,v> implements Map<k,v>
    Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。
    Properties集合是一个唯一和IO流相结合的集合
        可以使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
        可以使用Properties集合中的方法load,把硬盘中保存的文件(键值对),读取到集合中使用

    属性列表中每个键及其对应值都是一个字符串。
        Properties集合是一个双列集合,key和value默认都是字符串
 */
public class DemoProperties {
    public static void main(String[] args) throws IOException {
    /*
        使用Properties集合存储数据,遍历取出Properties集合中的数据
        Properties集合是一个双列集合,key和value默认都是字符串
        Properties集合有一些操作字符串的特有方法
            Object setProperty(String key, String value) 调用 Hashtable 的方法 put。
            String getProperty(String key) 通过key找到value值,此方法相当于Map集合中的get(key)方法
            Set<String> stringPropertyNames() 返回此属性列表中的键集，其中该键及其对应值是字符串,此方法相当于Map集合中的keySet方法
     */
        // 创建 Properties 集合对象
        Properties properties = new Properties();

        // 使用setProperty往集合中添加数据
        properties.setProperty("冰糖雪狸", "17");
        properties.setProperty("Fox", "16");
        properties.setProperty("Cat", "18");
        // prop.put(1,true);  可以，但不推荐使用Map接口的put方法。应该使用特有方法

        // 使用stringPropertyNames把Properties集合中的键取出,存储到一个Set集合中
        Set<String> set_prop = properties.stringPropertyNames();
        for (String key : set_prop) {
            // 使用getProperty方法通过key获取value
            String value = properties.getProperty(key);
            System.out.println(key + "=" + value);
        }





    /*
        可以使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
        void store(OutputStream out, String comments)
        void store(Writer writer, String comments)
        参数:
            OutputStream out:字节输出流,不能写入中文
            Writer writer:字符输出流,可以写中文
            String comments:注释,用来解释说明保存的文件是做什么用的
                    不能使用中文,会产生乱码,默认是Unicode编码
                    一般使用""空字符串

        使用步骤:
            1.创建Properties集合对象,添加数据
            2.创建字节输出流/字符输出流对象,构造方法中绑定要输出的目的地
            3.使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
            4.释放资源
     */
        // 2.创建字节输出流/字符输出流对象,构造方法中绑定要输出的目的地。注意：字节流不能写中文，字符流可以
        FileWriter fw = new FileWriter("526 - 集合_Properties基本使用\\output.txt");

        properties.store(fw, "我是一条comments注释");  // 【注意】注释有中文不能正常显示（因为使用的是Unicode编码）
        // 释放资源
        fw.close();
    }
}

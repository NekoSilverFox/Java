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
    public static void main(String[] args) {
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
        properties.setProperty("Silverfox", "17");
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
    }
}

import java.util.HashMap;
import java.util.Hashtable;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/18 12:25
 * @Author : NekoSilverfox
 * @FileName: DemoHashtable
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 530 - 集合_Hashtable基本使用
    /*
        java.util.Hashtable<K,V>集合 implements Map<K,V>接口

    Hashtable:底层也是一个哈希表,是一个线程安全的集合,是单线程集合,速度慢
    HashMap:底层是一个哈希表,是一个线程不安全的集合,是多线程的集合,速度快

    HashMap集合(之前学的所有的集合):可以存储null值,null键
    Hashtable集合,不能存储null值,null键. 此类实现一个哈希表，该哈希表将键映射到相应的值。任何非 null 对象都可以用作键或值

    Hashtable和Vector集合一样,在jdk1.2版本之后被更先进的集合(HashMap,ArrayList)取代了
    Hashtable的子类Properties依然活跃在历史舞台
    Properties集合是一个唯一和IO流相结合的集合
     */
public class DemoHashtable {
    public static void main(String[] args) {
        // 首先测试HashMap
        HashMap<String, String> hash_map = new HashMap<>();
        hash_map.put("a", "a");
        hash_map.put("b", null);
        hash_map.put(null, "c");
        hash_map.put(null, null);
        System.out.println(hash_map);  // {null=null, a=a, b=null}

        // 再次测试Hashtable
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("a", "a");
        hashtable.put("b", null);  // NullPointerException
        hashtable.put(null, "c");  // NullPointerException
        hashtable.put(null, null);  // NullPointerException
    }
}

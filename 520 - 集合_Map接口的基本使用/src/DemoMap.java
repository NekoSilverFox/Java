import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/16 23:10
 * @Author : NekoSilverfox
 * @FileName: DemoMap
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 520 - 集合_Map接口的基本使用
    /*
    java.util.Map<k,v>集合
    Map集合的特点:
        1.Map集合是一个双列集合,一个元素包含两个值(一个key,一个value)
        2.Map集合中的元素,key和value的数据类型可以相同,也可以不同
        3.Map集合中的元素,key是不允许重复的,value是可以重复的
        4.Map集合中的元素,key和value是一一对应

    java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合的特点:
        1.HashMap集合底层是哈希表:查询的速度特别的快
            JDK1.8之前:数组+单向链表
            JDK1.8之后:数组+单向链表|红黑树(链表的长度超过8):提高查询的速度
        2.hashMap集合是一个无序的集合,存储元素和取出元素的顺序有可能不一致

   java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
   LinkedHashMap的特点:
        1.LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
        2.LinkedHashMap集合是一个有序的集合,存储元素和取出元素的顺序是一致的
 */
public class DemoMap {
    public static void main(String[] args) {
//        simpleMethod();
//        foreachMethod_1();
        foreachMethod_2();
    }

    private static void foreachMethod_2() {
    /* 【重点】
    Map集合遍历的第二种方式:使用Entry对象遍历, 【Entry是Map的一个静态内含类，所以可以直接点出来】

    Map集合中的方法:
        Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图。

    实现步骤:
        1. 使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
        2. 遍历Set集合,获取每一个Entry对象
        3. 使用Entry对象中的方法getKey()和getValue()获取键与值
     */
        //创建Map集合对象,多态
        Map<String, Integer> fox_map = new HashMap<>();
        System.out.println(fox_map.put("fox", 12));
        System.out.println(fox_map.put("silverfox", 14));
        System.out.println(fox_map.put("redfox", 17));
        System.out.println(fox_map);

        // 1. 使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
        Set<Map.Entry<String, Integer>> entry_set = fox_map.entrySet();

        // 2. 遍历Set集合,获取每一个Entry对象
        // 使用迭代器遍历Set集合
        System.out.println("使用while进行循环：");
        Iterator<Map.Entry<String, Integer>> it = entry_set.iterator();
        while (it.hasNext()) {

            // 3. 使用Entry对象中的方法getKey()和getValue()获取键与值
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        // 使用增强for遍历Set集合
        System.out.println("使用for进行循环：");
        for (Map.Entry<String, Integer> entry : entry_set) {
            // 3. 使用Entry对象中的方法getKey()和getValue()获取键与值
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" +value);
        }
    }

    private static void foreachMethod_1() {
        /*
            Map集合的第一种遍历方式:通过键找值的方式
            Map集合中的方法:
                 Set<K> keySet() 返回此映射中包含的键的 Set 视图。
            实现步骤:
                1.使用Map集合中的方法keySet(),把Map集合所有的key取出来,存储到一个Set集合中
                2.遍历set集合,获取Map集合中的每一个key
                3.通过Map集合中的方法get(key),通过key找到value
         */
        //创建Map集合对象,多态
        Map<String, Integer> fox_map = new HashMap<>();
        System.out.println(fox_map.put("fox", 12));
        System.out.println(fox_map.put("silverfox", 14));
        System.out.println(fox_map.put("redfox", 17));
        System.out.println(fox_map);


        // 1.使用Map集合中的方法keySet(),把Map集合所有的key取出来,存储到一个Set集合中
        Set<String> tmp_set = fox_map.keySet();


        //2. 遍历set集合,获取Map集合中的每一个key
        //使用迭代器遍历Set集合
        System.out.println("使用while进行循环：");
        Iterator<String> it = tmp_set.iterator();
        while (it.hasNext()) {
            //3.通过Map集合中的方法get(key),通过key找到value
            String key = it.next();
            Integer value = fox_map.get(key);  // 【重点】 这里最好使用 Integer，而不是int。因为一旦返回的是null，int会发生异常！！
            System.out.println(key + "=" + value);
        }

        // 使用增强for遍历Set集合
        System.out.println("使用for进行循环：");
        for (String key : tmp_set) {
            Integer value = fox_map.get(key);
            System.out.println(key + "=" + value);
        }

    }

    private static void simpleMethod() {
        //创建Map集合对象,多态
        Map<String, Integer> fox_map = new HashMap<>();

      /*
        public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
            返回值:v
                存储键值对的时候,key不重复,返回值V是null
                存储键值对的时候,key重复,会使用新的value替换map中重复的value,【返回被替换的value值】
      */
        System.out.println(fox_map.put("fox", 12));  // null
        System.out.println(fox_map.put("fox", 13));  // 12
        System.out.println(fox_map.put("silverfox", 14));  // null
        System.out.println(fox_map.put("redfox", 17));  // null
        System.out.println(fox_map);  // {silverfox=14, redfox=17, fox=13}


    /*
        public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，【返回被删除元素的值】。
            返回值:V
                key存在,v返回被删除的值
                key不存在,v返回null
     */
        System.out.println(fox_map.remove("fox"));  // 13
        System.out.println(fox_map.remove("panda"));  // null
        System.out.println(fox_map);  // {silverfox=14, redfox=17}


    /*
        public V get(Object key) 根据指定的键，在Map集合中获取对应的【值】。
            返回值:
                key存在,返回对应的value值
                key不存在,返回null
     */
        System.out.println(fox_map.get("silverfox"));  // 14
        System.out.println(fox_map.get("dog"));  // null


    /*
        boolean containsKey(Object key) 判断集合中是否包含指定的键。
        包含返回true,不包含返回false
     */
        System.out.println(fox_map.containsKey("redfox"));  // true
        System.out.println(fox_map.containsKey("dog"));  // false
    }
}

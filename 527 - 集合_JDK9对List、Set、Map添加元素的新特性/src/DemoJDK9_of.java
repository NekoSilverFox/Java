import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/18 13:17
 * @Author : NekoSilverfox
 * @FileName: DemoJDK9_of
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

/*
    JDK9的新特性:
        List接口,Set接口,Map接口:里边增加了一个静态的方法of,可以给集合一次性添加多个元素
        static <E> List<E> of​(E... elements)
        使用前提:
            当集合中存储的元素的个数已经确定了,不在改变时使用
     注意:
        1.of方法只适用于List接口,Set接口,Map接口,【不适用于接口的实现类】
        2.of方法的返回值是一个不能改变的集合,集合不能再使用add,put方法添加元素,会抛出异常
        3.Set接口和Map接口在调用of方法的时候,不能有重复的元素,否则会抛出异常
 */

public class DemoJDK9_of {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d", "a");
        System.out.println(list);  // [a, b, c, d]
// 【重点】        list.add("e");  // 因为通过 List.of 添加的集合长度是固定的，所以会报：UnsupportedOperationException:不支持操作异常

//        Set<String> set = Set.of("a", "b", "d", "a");  IllegalArgumentException:非法参数异常,有重复的元素
        Set<String> set = Set.of("a", "b", "d");
        System.out.println(set);  // [b, a, d]

        //Map<String, Integer> map = Map.of("张三", 18, "李四", 19, "王五", 20,"张三",19);// IllegalArgumentException:非法参数异常,有重复的元素
        Map<String, Integer> map = Map.of("张三", 18, "李四", 19, "王五", 20);
        System.out.println(map);//{王五=20, 李四=19, 张三=18}
        //map.put("赵四",30);  // 通过 of 方法添加元素的集合，长度是固定的 UnsupportedOperationException:不支持操作异常
    }
}

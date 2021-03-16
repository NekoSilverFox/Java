import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/16 17:08
 * @Author : NekoSilverfox
 * @FileName: DemoDifferentBetweenLinkedHashSetAndHashSet
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
 // 516 - 集合_LinkedHashSet与HashSet区别
    /*
    java.util.LinkedHashSet集合 extends HashSet集合

    LinkedHashSet集合特点:【重点】
        底层是一个哈希表(数组 + 链表/红黑树) + 【链表】: 【多了一条链表(记录元素的存储顺序),保证元素有序】
 */
public class DemoDifferentBetweenLinkedHashSetAndHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hash_set = new HashSet<>();
        hash_set.add(3);
        hash_set.add(1);
        hash_set.add(2);
        System.out.println(hash_set);  // [1, 2, 3]

        LinkedHashSet<Integer> linked_hash_set = new LinkedHashSet<>();
        linked_hash_set.add(3);
        linked_hash_set.add(1);
        linked_hash_set.add(2);
        System.out.println(linked_hash_set);// [3, 1, 2]
    }
}

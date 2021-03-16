import java.util.LinkedList;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/15 21:43
 * @Author : NekoSilverfox
 * @FileName: DemoLinkedList
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 507 - 集合_LinkedList

/*
    java.util.LinkedList集合 implements List接口
    LinkedList集合的特点:
        1.底层是一个链表结构:查询慢,增删快；底层是一个【双向链表】
        2.里边包含了大量操作首尾元素的方法
        注意:使用LinkedList集合特有的方法,不能使用多态

        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public void push(E e):将元素推入此列表所表示的堆栈。

        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。

        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。

        - public boolean isEmpty()：如果列表不包含元素，则返回true。

 */

public class DemoLinkedList {

    public static void main(String[] args) {
        LinkedList<String> linked_list = new LinkedList<>();

        // public void addFirst(E e):将指定元素插入此列表的开头。
        // public void push(E e):将指定元素插入此列表的开头(将元素推入此列表所表示的堆栈)。
        linked_list.addFirst("a");
        linked_list.push("b");
        System.out.println(linked_list);  // [b, a]

        // public void addLast(E e):将指定元素添加到此列表的结尾。
        // public void add(E e):将指定元素添加到此列表的结尾。
        linked_list.addLast("c");
        linked_list.add("d");
        System.out.println(linked_list);  // [b, a, c, d]

        // peekFirst() 获取但不移除此列表的第一个元素；如果此列表为空，则返回 null。
        System.out.println("peekFirst: " + linked_list.peekFirst());  // b


        // E peekLast() 获取但不移除此列表的最后一个元素；如果此列表为空，则返回 null。
        System.out.println("peekLast: " + linked_list.peekLast());  // d

        // public E getFirst():返回此列表的第一个元素。
        System.out.println(linked_list.getFirst());  // b

        // public E getLast():返回此列表的最后一个元素。
        System.out.println(linked_list.getLast());  // d

        // public E get(int index) 根据索引返回元素
        System.out.println(linked_list.get(2));  // c

        // pollFirst() 获取并移除此列表的第一个元素；如果此列表为空，则返回 null
        // public E removeFirst():移除并返回此列表的第一个元素。
        System.out.println("删除的：" + linked_list.removeFirst());  // 删除的：b
        System.out.println("删除后：" + linked_list);  // 删除后：[a, c, d]

        // pollLast() 获取并移除此列表的最后一个元素；如果此列表为空，则返回 null
        // public E removeLast():移除并返回此列表的最后一个元素。
        System.out.println("删除的：" + linked_list.removeLast());  // 删除的：d
        System.out.println("删除后：" + linked_list);  // 删除后：[a, c]

        // public E pop():从此列表所表示的堆栈处弹出一个元素（弹出第一个元素，和push对应）。
        System.out.println("弹出的：" + linked_list.pop());
        System.out.println("弹出后：" + linked_list);

        // public boolean isEmpty()：如果列表不包含元素，则返回true。
        System.out.println(linked_list.isEmpty());  // False
    }
}

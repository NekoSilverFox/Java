import java.util.HashSet;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/16 16:33
 * @Author : NekoSilverfox
 * @FileName: CanNotSaveSameElement
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

/*
    set 不存储相同元素的原理，【重点】
    1. 通过元素的hashCode在容器中查找是否有相同哈希值的元素，
        如果没有，直接添加该元素的【哈希值】，并将元素挂到哈希值底部
        如果有，再通过调用元素的equals方法，比较元素内容是否相同；如果内容不相同，将该元素挂在相同哈希值的底部（链表，链表的节点超过8个会自动转换为红黑树）
    所以说存储的元素必须重写hashCode方法和equals方法
 */

public class CanNotSaveSameElement {
    public static void main(String[] args) {
        HashSet<String> hash_set = new HashSet<>();
        hash_set.add("ABC");  // 添加第一个 ABC 时，发现set中没有。添加
        hash_set.add("ABC");  // 添加第二个 ABC 时，发现set中有【哈希值相同时】，再比较内容，也相同。不添加
        hash_set.add("重地");  // 添加第一个 重地 时，发现set中没有相同的哈希值元素。添加
        hash_set.add("通话");  // 添加第一个 通话 时，发现set中【有】相同的哈希值元素，再比较内容了，不相同。添加
        hash_set.add("abc");

        System.out.println(hash_set);  // [ABC, 重地, 通话, abc]
    }
}

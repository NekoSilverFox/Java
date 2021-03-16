/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/16 13:58
 * @Author : NekoSilverfox
 * @FileName: Person
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class Person extends Object {
    /**
     * toString() 原码：
     *     public String toString() {
     *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
     *     }
     *     返回的后半部分就是哈希值的16进制
     */
    // 重写 hashCode 方法


    @Override
    public int hashCode() {
        return 233333333;
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/18 12:37
 * @Author : NekoSilverfox
 * @FileName: TaskCountChar
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class TaskCountChar {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        Map<Character, Integer> char_map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (char_map.containsKey(c)) {
                int value = char_map.get(c);
                value++;
                char_map.put(c, value);
            } else {
                char_map.put(c, 1);
            }
        }


        // foreach
        for (Character key : char_map.keySet()) {
            Integer value = char_map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}

import jdk.jshell.EvalException;

import java.util.*;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/18 14:21
 * @Author : NekoSilverfox
 * @FileName: TaskPoker
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 523 - 集合_练习_斗地主案例（玩家牌有序版）
public class TaskPoker {
    public static void main(String[] args) {
        final int NUM_POKER = 54;

        // 1.准备牌
        // 存数花色
        String[] color_poker = {"♠", "♥", "♣", "♦"};
        // 存储数字
        String[] type_poker = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        // 2. 储存牌和花色，顺便建立关联表
        HashMap<Integer, String> poker_map = new HashMap<>();
        ArrayList<Integer> random_list = new ArrayList<>();
        int tmp_count = 0;
        for (String type : type_poker) {
            for (String color : color_poker) {
                poker_map.put(tmp_count, (color + type));
                random_list.add(tmp_count);
                ++tmp_count;
            }
        }
        poker_map.put(tmp_count, "小王");
        random_list.add(tmp_count);

        ++tmp_count;
        poker_map.put(tmp_count, "大王");
        random_list.add(tmp_count);

        // 查看牌
        foreachMap(poker_map);
        System.out.println("\n");
        System.out.println(random_list);


        // 打乱牌（打乱对应表 random_arr）
        Collections.shuffle(random_list);
        System.out.println(random_list);

        // 建立玩家
        ArrayList<Integer> player_1 = new ArrayList<>();
        ArrayList<Integer> player_2 = new ArrayList<>();
        ArrayList<Integer> player_3 = new ArrayList<>();
        ArrayList<Integer> end_poker = new ArrayList<>();
        for (int i = 0; i < random_list.size(); i++) {
            Integer num = random_list.get(i);
            if (i >= 51) {
                end_poker.add(num);
            } else if (i % 3 == 0) {
                player_1.add(num);
            } else if (i % 3 == 1) {
                player_2.add(num);
            } else if (i % 3 == 2) {
                player_3.add(num);
            } else {
                System.out.println("未知异常！");
            }
        }

        // 给玩家的牌排序
        System.out.println("玩家牌索引值排序前：");
        System.out.println(player_1);
        System.out.println(player_2);
        System.out.println(player_3);
        System.out.println(end_poker);
        Collections.sort(player_1);
        Collections.sort(player_2);
        Collections.sort(player_3);
        Collections.sort(end_poker);
        System.out.println("玩家牌索引值排序后：");
        System.out.println(player_1);
        System.out.println(player_2);
        System.out.println(player_3);
        System.out.println(end_poker);


        // 打印玩家牌
        System.out.println("玩家手上的牌，排序后：");
        foreachMapInArrayIndex(poker_map, player_1);
        foreachMapInArrayIndex(poker_map, player_2);
        foreachMapInArrayIndex(poker_map, player_3);
        foreachMapInArrayIndex(poker_map, end_poker);
    }

    public static <K, V> void foreachMap(Map<K, V> map) {
        Set<Map.Entry<K, V>> entry_map = new HashSet<>();
        entry_map = map.entrySet();
        for (Map.Entry<K, V> entry : entry_map) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
    }

    public static <M> void foreachArray(M[] array) {
        for (M element : array) {
            System.out.print(element + " ");
        }
    }

    public static <K, V> void foreachMapInArrayIndex(Map<K, V> map, List<K> list) {
        for (K key : list) {
            V value = map.get(key);
            System.out.print(value + " ");
        }
        System.out.println("\n");
    }
}

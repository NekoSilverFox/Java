import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/15 20:10
 * @Author : NekoSilverfox
 * @FileName: TaskPoker
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    斗地主综合案例:
        1.准备牌
        2.洗牌
        3.发牌
        4.看牌
 */
public class TaskPoker {
    public static void main(String[] args) {
        // 1.准备牌
        // 存数花色
        String[] color_poker = {"♠", "♥", "♣", "♦"};
        // 存储数字
        String[] type_poker = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        // 存储牌
        ArrayList<String> arr_poker = new ArrayList<>();
        for (String color : color_poker) {
            for (String type : type_poker) {
                arr_poker.add(color + type);
            }
        }
        arr_poker.add("大王");
        arr_poker.add("小王");
        System.out.println("原扑克牌：" + arr_poker);

        /*
            2.洗牌
            使用集合的工具类Collections中的方法
            static void shuffle(List<?> list) 使用默认随机源对指定列表进行置换。
         */
        Collections.shuffle(arr_poker);
        System.out.println("洗牌后：" + arr_poker);

        // 3.发牌
        ArrayList<String> player_1 = new ArrayList<>();
        ArrayList<String> player_2 = new ArrayList<>();
        ArrayList<String> player_3 = new ArrayList<>();
        ArrayList<String> last_three_poker = new ArrayList<>();

        for (int i = 0; i < arr_poker.size(); i++) {
            String poker = arr_poker.get(i);

            if (i >= 51) {
                last_three_poker.add(poker);
            } else if (i % 3 == 0) {
                player_1.add(poker);
            } else if (i % 3 == 1) {
                player_2.add(poker);
            } else if (i % 3 == 2) {
                player_3.add(poker);
            }
        }

        // 4.看牌
        System.out.println("Player 1: " + player_1);
        System.out.println("Player 2: " + player_2);
        System.out.println("Player 3: " + player_3);
        System.out.println("底牌     : " + last_three_poker);
    }
}

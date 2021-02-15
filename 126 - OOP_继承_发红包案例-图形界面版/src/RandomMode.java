import red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        // 随机分配，可能多，可能少
        // 最少一分钱，最多不超过剩下金额的二倍

        Random random = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        // 只需要发 n-1个，剩下的不需要发
        for (int i = 0; i < totalCount - 1; i++) {
            int tempGiveMoney = 1 + random.nextInt(leftMoney / leftCount * 2);
            list.add(tempGiveMoney);
            --leftCount;
            leftMoney -= tempGiveMoney;
        }
        list.add(leftMoney);

        return list;
    }
}

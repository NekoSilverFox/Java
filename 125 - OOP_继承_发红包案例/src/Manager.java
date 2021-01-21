import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
        // super()
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMany, int count) {
        // 首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        // 首先看一下群主自己有多少钱
        int leftMoney = super.getMoney();
        if (totalMany > leftMoney) {
            System.out.println("余额不足");
            return redList;
        }

        // 扣钱，其实就是重新设置余额
        super.setMoney(leftMoney - totalMany);

        // 发红包需要平均拆分成为count份
        int avg = totalMany / count;
        int mod = totalMany % count; // 余数，也就是甩下的零头

        // 除不开的零头，包在最后一个红包当中
        // 下面把红包一个一个放到集合当
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        // 最后一个红包
        redList.add(avg + mod);

        return redList;
    }
}

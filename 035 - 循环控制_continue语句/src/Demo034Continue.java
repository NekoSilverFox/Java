// 035 - 循环控制_continue语句

/*
另一种循环控制语句是continue关键字。
一旦执行，立刻跳过当前次循环剩余内容，马上开始下一次循环。
*/

public class Demo034Continue {
    public static void main(String[] args) {
        for (int i = 1; i < 10; ++i) {
            if (i == 4) continue;
            System.out.println("第 " + i + " 层到了");
        }
    }
}

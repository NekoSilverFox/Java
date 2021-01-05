// 030 - 循环结构_for循环

/*
循环结构的基本组成部分，一般可以分成四部分：
    1. 初始化语句：在循环开始最初执行，而且只做唯一一次。
    2. 条件判断：如果成立，则循环继续；如果不成立，则循环退出。
    3. 循环体：重复要做的事情内容，若干行语句。
    4. 步进语句：每次循环之后都要进行的扫尾工作，每次循环结束之后都要执行一次。
*/

public class Demo030LoopFor {
    public static void main(String[] args) {
        for (int i = 0; i < 100; ++i) {
            System.out.println(i);
        }
    }
}

// 030 - 循环结构_for循环

/*
while循环有一个标准格式，还有一个扩展格式。

标准格式：
    while (条件判断) {
        循环体
    }

扩展格式：
    初始化语句;
    while (条件判断) {
        循环体;
        步进语句;
    }
*/

public class Demo031LoopWhile {
    public static void main(String[] args) {
        int i = 0;

        while (i < 100) {
            System.out.println("当前为：" + i);
            i++;
        }
    }
}

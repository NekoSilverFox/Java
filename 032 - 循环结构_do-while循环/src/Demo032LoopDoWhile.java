/*
do-while循环的标准格式：

do {
	循环体
} while (条件判断);

扩展格式：

初始化语句
do {
	循环体
	步进语句
} while (条件判断);
*/

public class Demo032LoopDoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            ++i;
        } while (i < 40);
    }
}

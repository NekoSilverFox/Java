// 026 - 选择结构_穿透的switch结构

/*
switch语句使用的注意事项：
    1. 多个case后面的数值不可以重复。

    2. switch后面小括号当中只能是下列数据类型：
    基本数据类型：byte/short/char/int
    引用数据类型：String字符串、enum枚举

    3. switch语句格式可以很灵活：前后顺序可以颠倒，而且break语句还可以省略。
    “匹配哪一个case就从哪一个位置向下执行，直到遇到了break或者整体结束为止。”
*/

public class Demo026SwitchNotice {
    public static void main(String[] args) {
        int num = 2;
        switch (num) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                // break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
                break;
        } // switch
    }
}

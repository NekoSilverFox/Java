// 036 - 循环嵌套

// 打印一天中所有的时刻，精确到秒
public class Demo036LoopTime {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; ++hour) {
            for (int min = 0; min < 60; ++min) {
                for (int sec = 0; sec < 60; ++sec) {
                    printHour(hour);
                    System.out.printf(":");
                    printMinOrSec(min);
                    System.out.printf(":");
                    printMinOrSec(sec);
                    System.out.printf("\n");
                }
            }
        }
    }

    public static void printHour(int hour) {
        if (hour < 10) {
            System.out.printf("0" + hour);
        } else {
            System.out.printf("" + hour);
        }

    }

    public static void printMinOrSec(int time) {
        if (time < 10) {
            System.out.printf("0" + time);
        } else {
            System.out.printf("" + time);
        }
    }
}

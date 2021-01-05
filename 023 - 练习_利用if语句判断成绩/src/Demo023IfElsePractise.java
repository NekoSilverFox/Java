// 023 - 练习_利用if语句判断成绩
public class Demo023IfElsePractise {
    public static void main(String[] args) {
        int score = 120;

        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("好");
        } else if (score >= 70 && score < 80) {
            System.out.println("良");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else if (score >= 0 && score < 60) {
            System.out.println("不及格");
        } else { // 单独处理边界之外的不合理情况
            System.out.println("数据错误");
        }
    }
}

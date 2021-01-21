public class Son extends Father{
    int num = 20;

    public void method() {
        int num = 30;
        System.out.println(num); // 30, 局部变量
        System.out.println(this.num); // 20 本类的成员变量
        System.out.println(super.num); // 10, 父类的成员变量
    }
}

/*
super关键字用来访问父类内容，而this关键字用来访问本类内容。用法也有三种：

    1. 在本类的成员方法中，访问本类的成员变量。
    2. 在本类的成员方法中，访问本类的另一个成员方法。
    3. 在本类的构造方法中，访问本类的另一个构造方法。
在第三种用法当中要注意：
    A. this(...)调用也必须是构造方法的第一个语句，唯一一个。 【重点】
    B. super和this两种构造调用，不能同时使用。【重点】
 */

public class Son extends Father{
    int num = 20;

    public Son() {
//        System.out.println("test"); // 不能在 this 前放其他东西
        this(123);
        System.out.println("test");
    }

    public Son(int num) {

    }

    public void showNum(){
        int num = 10;
        System.out.println(num); // 局部变量
        System.out.println(this.num); // 成员变量
        System.out.println(super.num); // 父类的成员变量
     }

     public void methodA() {
         System.out.println("AAAA");
     }

     public  void methodB() {
        this.methodA();
         System.out.println("BBBBB");
     }
}

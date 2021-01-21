public class Employee {
    int num = 1;

    public Employee() {
        super(); // 在调用父类无参构造方法
//        super(20); // 在调用父类重载的构造方法
        System.out.println("Employee 的构造函数执行了");
    }

    public void method() {
        //        super(); // 错误写法！只有子类构造方法，才能调用父类构造方法。
        System.out.println("Employee 中的method函数执行了！");
    }
}

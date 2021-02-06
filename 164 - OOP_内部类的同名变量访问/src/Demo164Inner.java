// 164 - OOP_内部类的同名变量访问

public class Demo164Inner {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();
    }
}

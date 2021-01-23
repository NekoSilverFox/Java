public class MyInterfaceImpl /*extends Object*/ implements MyInterfaceA, MyInterfaceB{
    @Override
    public void method() {
        System.out.println("覆盖重写了AB接口都有的抽象方法");
    }

    @Override
    public void methodA() {
        System.out.println("Rewrite A");
    }

    @Override
    public void methodB() {
        System.out.println("Rewrite A");
    }

    @Override
    public void methodSameDefaultAB() {
        System.out.println("对AB相同的默认方法进行了重写");
    }
}

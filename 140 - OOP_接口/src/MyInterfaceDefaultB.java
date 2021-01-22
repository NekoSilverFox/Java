public class MyInterfaceDefaultB implements MyInterfaceDefault{
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("在B中重写了 methodDefault");
    }
}

public interface MyInterfaceB {
    public abstract void method();

    public abstract void methodB();

    public default void methodSameDefaultAB() {
        System.out.println("AB都有的方法");
    }
}

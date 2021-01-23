public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void methodCommon();

    public default void methodDefault() {
        System.out.println("BBB");
    }
}

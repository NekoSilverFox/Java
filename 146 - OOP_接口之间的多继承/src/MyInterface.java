/*
这个子接口当中有几个方法？答：4个。
methodA 来源于接口A
methodB 来源于接口B
methodCommon 同时来源于接口A和B
method 来源于我自己
 */

public interface MyInterface extends MyInterfaceA, MyInterfaceB {
    public abstract void method();

    // 多个父接口当中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写，【而且带着default关键字】。
    @Override
    public default void methodDefault() {

    }
}

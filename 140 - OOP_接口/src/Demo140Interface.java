// 140 - OOP_接口

/*
接口就是多个类的公共规范。
接口是一种引用数据类型，最重要的内容就是其中的：抽象方法。

如何定义一个接口的格式：
public interface 接口名称 {
    // 接口内容
}

备注：换成了关键字interface之后，编译生成的字节码文件仍然是：.java --> .class。

如果是Java 7，那么接口中可以包含的内容有：
    1. 常量
    2. 抽象方法

如果是Java 8，还可以额外包含有：
    3. 默认方法
    4. 静态方法

如果是Java 9，还可以额外包含有：
    5. 私有方法

接口使用步骤：
    1. 接口不能直接使用，必须有一个“实现类”来“实现”该接口。
    格式：
    public class 实现类名称 implements 接口名称 {
        // ...
    }
    2. 接口的实现类必须覆盖重写（实现）接口中所有的抽象方法。
    实现：去掉abstract关键字，加上方法体大括号。
    3. 创建实现类的对象，进行使用。

注意事项：
如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类。
 */

/*
1. 接口的默认方法，可以通过接口实现类对象，直接调用。
2. 接口的默认方法，也可以被接口实现类进行覆盖重写。
 */

public interface Demo140Interface {
    public static void main(String[] args) {
        // 错误写法！不能直接new接口对象使用。
//        MyInterfaceAbstract inter = new MyInterfaceAbstract();

        // 创建实现类的对象使用
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs();
        impl.methodAbs2();

        System.out.println("===========");
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();
        // 调用默认方法，如果实现类当中没有，会向上找接口
        a.methodDefault();// 这是新添加的默认方法

        System.out.println("===========");
        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();


        /*
        注意事项：不能通过接口实现类的对象来调用接口当中的静态方法。
        正确用法：通过接口名称，直接调用其中的静态方法。
        格式：
        接口名称.静态方法名(参数);
         */
        System.out.println("===========");
        // 错误写法！
//        MyInterfaceStaticImpl s = new MyInterfaceStaticImpl();
//        s.help();

        // 直接通过接口名称调用静态方法
        MyInterfaceStatic.help();

    }
}

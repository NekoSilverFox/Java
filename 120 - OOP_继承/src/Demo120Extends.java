// 120 - OOP_继承


/*
在继承的关系中，“子类就是一个父类”。也就是说，子类可以被当做父类看待。
例如父类是员工，子类是讲师，那么“讲师就是一个员工”。关系：is-a。

定义父类的格式：（一个普通的类定义）
public class 父类名称 {
    // ...
}

定义子类的格式：
public class 子类名称 extends 父类名称 {
    // ...
}
*/

/*
    继承关系中，父子类构造方法的访问特点：

    1. 子类构造方法当中有一个默认隐含的“super()”调用，所以一定是先调用的父类构造，后执行的子类构造。
    2. 子类构造可以通过super关键字来调用父类重载构造。
    3. super的父类构造调用，必须是子类构造方法的第一个语句。不能一个子类构造调用多次super构造。
    总结：
    子类必须调用父类构造方法，不写则赠送super()；写了则用写的指定的super调用，super只能有一个，还必须是第一个。
 */

public class Demo120Extends {
    public static void main(String[] args) {
        // 创建了一个子类对象
        Teacher teacher = new Teacher();
        // Teacher类当中虽然什么都没写，但是会继承来自父类的method方法。
        teacher.method();

        System.out.println(teacher.num); // 当有重名时，打印子类的（就近算则）
    }
}

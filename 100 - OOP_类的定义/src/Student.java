// 100 - OOP_类的定义

/*
面向过程：当需要实现一个功能的时候，每一个具体的步骤都要亲力亲为，详细处理每一个细节。
面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人，来帮我做事儿。
 */

/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。

1. 导包：也就是指出需要使用的类，在什么位置。
import 包名称.类名称;
import cn.itcast.day06.demo01.Student;
对于和当前类属于同一个包的情况，可以省略导包语句不写。

2. 创建，格式：
类名称 对象名 = new 类名称();
Student stu = new Student();

3. 使用，分为两种情况：
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名(参数)
（也就是，想用谁，就用对象名点儿谁。）

注意事项：
如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样。
 */

public class Student {
    String name;
    int age;

    public void eat() {
        System.out.println("EAT");
    }

    public void sleep() {
        System.out.println("SLEEP");
    }

    public void study() {
        System.out.println("STUDY");
    }
}

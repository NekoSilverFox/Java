import java.lang.invoke.MethodType;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/11 0:02
 * @Author : NekoSilverfox
 * @FileName: Son
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 484 - 方法引用_通过super引用父类的成员方法
public class Son extends Father{
    // 子类重写父类sayHello的方法
    @Override
    public void sayHello() {
        System.out.println("Hello 我是你儿子");
    }

    // 定义一个方法参数传递 Meeting 接口
    public void method(Meeting meeting) {
        meeting.meet();
    }

    public void show() {
        //调用method方法,方法的参数 Meeting 是一个函数式接口,所以可以传递Lambda
        method(() -> {
            // 创建父类Human对象
            Father father = new Father();
            father.sayHello();
        });

        //因为有子父类关系,所以存在的一个关键字super,代表父类,所以我们可以直接使用super调用父类的成员方法
        method(() -> super.sayHello());

      /*
           使用super引用类的成员方法
           super是已经存在的
           父类的成员方法sayHello也是已经存在的
           所以我们可以直接使用super引用父类的成员方法
       */
        method(super::sayHello);  // 【重点】

    }

    public static void main(String[] args) {
        new Son().show();
    }
}

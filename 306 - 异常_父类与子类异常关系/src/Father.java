/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/22 17:18
 * @Author : NekoSilverfox
 * @FileName: Father
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
/*
    子父类的异常:
        - 如果父类抛出了多个异常,子类重写父类方法时,抛出和父类相同的异常或者是父类异常的子类或者不抛出异常。
        - 父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常。此时子类产生该异常，只能捕获处理，不能声明抛出
    注意:
        父类异常时什么样,子类异常就什么样
 */
public class Father {
    public void show01() throws NullPointerException, ClassCastException {
    }

    public void show02() throws IndexOutOfBoundsException {
    }

    public void show03() throws IndexOutOfBoundsException {
    }

    public void show04() throws Exception {
    }

    public void show05() {
    }
}

class Zi extends Father {
    // 子类重写父类方法时，抛出和父类相同的异常
    public void show1() throws NullPointerException, ClassCastException {
    }

    // 子类重写父类方法时,抛出父类异常的子类
    @Override
    public void show02() throws ArrayIndexOutOfBoundsException {
    }

    // 子类重写父类方法时，不抛出异常
    @Override
    public void show03() {
    }

    // 此时子类产生该异常，只能捕获处理，不能声明抛出
    @Override
    public void show04() {
        try {
            throw new Exception("编译器异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /*
        父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常。

     */
//    public void show05() throws Exception {}


}
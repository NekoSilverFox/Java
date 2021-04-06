import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/6 23:45
 * @Author : NekoSilverfox
 * @FileName: Demo633
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

// 633 - 反射_获取运行时类的对象
public class Demo633 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("User");
/*        User user1 = new User();
        c1 = user1.getClass();*/


        // 获取类的名字
        System.out.println(c1.getName());  // User 包名+类名
        System.out.println(c1.getSimpleName());  // User 只有类名

        System.out.println("====================");

        // 获取类的属性
        Field[] fields = c1.getFields();  // 只能找到public属性
        for (Field field : fields) {
            System.out.println(field);
        }  // 只能找到public属性，啥也没打印出来

        System.out.println("====================");

        fields = c1.getDeclaredFields();  // 获得全部的属性
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("====================");

//        Field name = c1.getField("name");  // 获得指定【public】属性的值
        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        System.out.println("====================");




        // 获取类的方法
        Method[] methods = c1.getMethods();  // 获得本类及其父类的全部public方法
        for (Method method : methods) {
            System.out.println("正常的：" + method);
        }

        Method[] declaredMethod = c1.getDeclaredMethods();  // 获得本类的所有方法
        for (Method method : declaredMethod) {
            System.out.println("getDeclaredMethods：" + method);
        }

        System.out.println("====================");

        // 获取指定方法（需要传入参数）
        // 【重点】因为有重载的机制，所以说要传入一个参数。不然无法确定唯一
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        System.out.println("====================");



        // 获取构造器
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("getConstructors" + constructor);
        }

        Constructor[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println("getDeclaredConstructors: " + declaredConstructor);
        }

        // 获取指定构造器
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class);
        System.out.println(declaredConstructor);  // public User(java.lang.String,int)


    }
}

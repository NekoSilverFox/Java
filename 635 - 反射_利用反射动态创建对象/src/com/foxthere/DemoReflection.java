/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/7 0:38
 * @Author : NekoSilverfox
 * @FileName: DemoReflection
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.foxthere;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 635 - 反射_利用反射动态创建对象
public class DemoReflection {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        // 获得 Class 对象
        Class userClass = Class.forName("com.foxthere.User");

        // 构造一个对象
        User user = (User) userClass.newInstance();  // 本质上是调用了无参构造器
        System.out.println(user);  // User{name='null', age=0}

        // 通过有参构造器构造对象
        Constructor constructor = userClass.getConstructor(String.class, int.class);
        User user2 = (User) constructor.newInstance("冰糖雪狸", 17);
        System.out.println(user2);  // User{name='冰糖雪狸', age=17}

        // 通过构造器调用方法
        Method setName = userClass.getDeclaredMethod("setName", String.class);
        setName.invoke(user, "神奇的冰糖雪狸");  // 激活这个方法，参数：`对象 ...参数...`
        System.out.println(user);  // User{name='神奇的冰糖雪狸', age=0}

        // 通过反射操作属性
        Field name = userClass.getDeclaredField("name");
        name.setAccessible(true);  // 【暴力反射】不知直接操作【private】属性，如果需要则关闭权限安全监测。不然强行赋值会报错
        name.set(user, "非常神奇的冰糖雪狸");
        System.out.println(user);  // User{name='非常神奇的冰糖雪狸', age=0}


    }
}

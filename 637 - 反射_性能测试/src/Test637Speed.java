import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/7 1:02
 * @Author : NekoSilverfox
 * @FileName: Test637Speed
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 637 - 反射_性能测试
public class Test637Speed {

    private static final int RUN_TIME = 1000000000;

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test01();
        test02();
        test03();

    }


    // 使用普通方式调用
    public static void test01() {
        long startTime = System.currentTimeMillis();

        User user = new User();

        for (int i = 0; i < RUN_TIME; i++) {
            user.getName();
        }

        System.out.println("使用普通方式调用用时（10亿次）：" + (System.currentTimeMillis() - startTime) + "ms");
    }

    // 使用普通方式调用
    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        long startTime = System.currentTimeMillis();

        User user = new User();
        Class userClass = user.getClass();

        Method getName = userClass.getDeclaredMethod("getName", null);


        for (int i = 0; i < RUN_TIME; i++) {
            getName.invoke(user, null);
        }

        System.out.println("使用普通方式调用用时（10亿次）：" + (System.currentTimeMillis() - startTime) + "ms");
    }

    // 使用普通方式调用 + 关闭安全监测
    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        long startTime = System.currentTimeMillis();

        User user = new User();
        Class userClass = user.getClass();

        Method getName = userClass.getDeclaredMethod("getName", null);
        getName.setAccessible(true);  // 关闭安全监测


        for (int i = 0; i < RUN_TIME; i++) {
            getName.invoke(user, null);
        }

        System.out.println("使用普通方式 + 关闭安全监测调用用时（10亿次）：" + (System.currentTimeMillis() - startTime) + "ms");
    }
}

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/7 13:37
 * @Author : NekoSilverfox
 * @FileName: DemoGetTemplate
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 639 - 反射_获取泛型信息
public class DemoGetTemplate {
    public static void main(String[] args) throws NoSuchMethodException {
        Method test01 = DemoGetTemplate.class.getMethod("test01", Map.class, List.class);
        Type[] genericParameterTypes = test01.getGenericParameterTypes();

        for (Type genericParameterType : genericParameterTypes) {
            System.out.println("# " + genericParameterType);

            if (genericParameterType instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println("##" + actualTypeArgument);
                }
            }
        }


        System.out.println("===========================");

        Method test02 = DemoGetTemplate.class.getMethod("test02", null);
        Type genericReturnType = test02.getGenericReturnType();

        System.out.println("返回值类型：" + genericReturnType);

        if (genericReturnType instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println("返回值类型中的类型：" + actualTypeArgument);
            }
        }
    }



    public void test01(Map<String, User> map, List<User> list) {
        System.out.println("TEST01");
    }

    public Map<String, User> test02() {
        System.out.println("TEST02");
        return null;
    }
}


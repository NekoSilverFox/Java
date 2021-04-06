import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/6 18:37
 * @Author : NekoSilverfox
 * @FileName: DemoAnnotation
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 622 - 注解_元注解_自定义注解
public class DemoAnnotation {

    // 注解可以显示赋值，如果没有默认值就必须给注解赋值；另外赋值顺序可以颠倒
    @MyAnnotation01(age = 17)
    public void test01() {}


    @MyAnnotation02("冰糖雪狸")
    public void test02() {}
}


@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation01 {
    // 里面放注解的参数：
    // 格式：参数类型 参数名();
    String name() default "";  // default表示一个默认值
    int age();
    int id() default -1;  // 如果默认值为-1，表示不存在

    String[] schools() default {"圣理工", "清华大学"};
}


@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation02 {
    String value();  // 【重点】如果只有一个参数，而且名字为value，那么在调用的时候就可以省略 `value = XXX`，可以直接赋值
}
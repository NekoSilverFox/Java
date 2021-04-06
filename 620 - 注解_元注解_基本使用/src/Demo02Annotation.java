import java.lang.annotation.*;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/6 17:10
 * @Author : NekoSilverfox
 * @FileName: DemoAnnotation
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

// 测试元注解
@MyAnnotation
public class Demo02Annotation {
    @MyAnnotation
    public void test() {

    }
}

// 定义一个元注解
@Target(value = {ElementType.METHOD, ElementType.TYPE})  // @Target 表示我们的注解可以用在哪些地方
@Retention(value = RetentionPolicy.RUNTIME)  // 表示我们的注解在什么时候还有效，Runtime > class > source
@Documented  // 表示是否将我们的注解生成在JavaDoc中
@Inherited  // 子类是否可以继承父类的注解
//public @interface MyAnnotation {  报错，因为一个文件内只能有一个 public 公共方法，所以下面我们用内部类的方法
@interface MyAnnotation {

}


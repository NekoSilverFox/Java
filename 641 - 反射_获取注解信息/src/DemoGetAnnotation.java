import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/7 14:39
 * @Author : NekoSilverfox
 * @FileName: DemoGetAnnotation
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
// 641 - 反射_获取注解信息
public class DemoGetAnnotation {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class student = Class.forName("Student");

        // 通过反射获得注解
        Annotation[] annotations = student.getAnnotations();

        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        // 获取注解指定的值
        TableStudent tableStudent = (TableStudent) student.getAnnotation(TableStudent.class);
        String value = tableStudent.value();
        System.out.println(value);

        // 获得类指定的注解
        Field name = student.getDeclaredField("name");
        FieldStudent annotation = name.getAnnotation(FieldStudent.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());
    }
}

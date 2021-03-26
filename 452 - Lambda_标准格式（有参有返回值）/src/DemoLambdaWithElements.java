import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/26 21:56
 * @Author : NekoSilverfox
 * @FileName: DemoLambdaWithElements
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 *
 * 452 - Lambda_标准格式（有参有返回值）
 */

public class DemoLambdaWithElements {
    public static void main(String[] args) {
        Person[] arrPerson = {
                new Person("Fox", 17),
                new Person("Silver", 15),
                new Person("Red Panda", 14),
                new Person("Tom", 18)
        };

        // 对数组中的Person对象使用Arrays的sort方法通过年龄进行排序（前面-后面）
//        Arrays.sort(arrPerson, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        // 使用Lambda表达式
        Arrays.sort(arrPerson, (Person l, Person r)->{
            return l.getAge() - r.getAge();
        });

        // 优化省略Lambda
        Arrays.sort(arrPerson, (l, r)->{return l.getAge() - r.getAge();});

        // 继续优化省略（返回值和打括号和分号）
        Arrays.sort(arrPerson, (l, r)->l.getAge() - r.getAge());


        for (Person p : arrPerson) {
            System.out.println(p);
        }

    }
}

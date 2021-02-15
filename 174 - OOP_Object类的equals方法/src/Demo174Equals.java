import java.util.Random;

// 174 - OOP_Object类的equals方法
public class Demo174Equals {
    public static void main(String[] args) {
        /*
            Person类默认继承了Object类，所以可以使用Object类的equals方法
            boolean equals(Object obj) 指示其他逗哥对象是否与此对象“相等”
         */

        Person p1 = new Person("Nick", 17);
        Person p2 = new Person("Wilde", 16);
        Person p3 = new Person("Wilde", 16);

        boolean b = p1.equals(p2);
        System.out.println(b);

        System.out.println(p2.equals(p3));

        Random random = new Random();
        System.out.println(p1.equals(random));

        System.out.println(p1.equals(null));

        System.out.println(p1.equals(p1));

    }
}

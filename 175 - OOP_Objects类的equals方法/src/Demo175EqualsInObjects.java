import java.util.Objects;

// 175 - OOP_Objects类的equals方法
public class Demo175EqualsInObjects {
    public static void main(String[] args) {
        String s1 = "asd";
        String s2 = "asd";

        /*
        比较两个对象是否相同，但是增加了一些健壮的方法
         */
        System.out.println(Objects.equals(s1, s2));
        System.out.println(Objects.equals(s1, null));
    }
}

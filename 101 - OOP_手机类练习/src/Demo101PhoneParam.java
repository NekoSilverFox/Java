public class Demo101PhoneParam {
    public static void main(String[] args) {
        Phone p3 = new Phone();
        p3.brand = "Mi";
        p3.color = "Black";
        p3.price = 1999;

        method(p3); // 传递的是地址！！！！！
        System.out.println("===============");
        System.out.println(p3.brand);
        System.out.println(p3.color);
        System.out.println(p3.price);
        System.out.println("===============");

    }

    public static void method(Phone param) {
        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);

        param.price = 0;
    }
}

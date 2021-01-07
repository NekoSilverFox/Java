// 102 - OOP_类作为返回值

public class Demo102Phone {
    public static void main(String[] args) {
        Phone p = getPhone();
        System.out.println(p.price);
        System.out.println(p.color);
        System.out.println(p.brand);
    }

    public static Phone getPhone() {
        Phone p = new Phone();

        p.brand = "苹果";
        p.price = 8388.0;
        p.color = "黑色";

        return p;
    }

}

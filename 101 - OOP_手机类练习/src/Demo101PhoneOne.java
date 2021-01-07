public class Demo101PhoneOne {
    public static void main(String[] args) {
        Phone p1 = new Phone();

        System.out.println(p1.brand); //null
        System.out.println(p1.color); // null
        System.out.println(p1.price); // 0.0

        p1.brand = "Mi";
        p1.color = "Black";
        p1.price = 1999;

        System.out.println("=================");

        System.out.println(p1.brand); //null
        System.out.println(p1.color); // null
        System.out.println(p1.price); // 0.0

        System.out.println("=================");

        p1.call("乔布斯");
        p1.sendMsg();
    }
}

public class Demo108Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("Fox");
        stu.setAge(17);
        System.out.println("Name: " + stu.getName() + "Age: " + stu.getAge());

        System.out.println("=============================");

        Student stu2 = new Student("Nick", 16);
        System.out.println("Name: " + stu2.getName() + "Age: " + stu2.getAge());

    }
}

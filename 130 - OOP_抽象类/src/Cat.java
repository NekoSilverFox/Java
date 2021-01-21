public class Cat extends Animal {
    public Cat() {
        System.out.println("Cat 类的构造函数执行难了");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat fish");
    }
}

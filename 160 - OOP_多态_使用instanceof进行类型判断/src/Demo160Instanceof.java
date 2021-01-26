
// 160 - OOP_多态_使用instanceof进行类型判断

/*
如何才能知道一个父类引用的对象，本来是什么子类？
格式：
对象 instanceof 类名称
这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例。
 */
public class Demo160Instanceof {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat(); // eat fish

        // 如果希望掉用子类特有方法，需要向下转型
        // 判断一下父类引用animal本来是不是Dog
        if (animal instanceof Dog) {
            Dog dog = (Dog)animal;
            dog.method();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat)animal;
            cat.method();
        }

        giveMePet(new Dog());

    }

    public static void giveMePet(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog)animal;
            dog.method();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat)animal;
            cat.method();
        }
    }

}

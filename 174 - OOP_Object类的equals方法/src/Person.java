import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    /*
        Person类默认继承了Object类,所以可以使用Object类的equals方法
        boolean equals(Object obj) 指示其他某个对象是否与此对象“相等”。
        equals方法源码:
            public boolean equals(Object obj) {
                return (this == obj);
            }
            参数:
                Object obj:可以传递任意的对象
                == 比较运算符,返回的是一个布尔值 true false
                基本数据类型:比较的是值
                引用数据类型:比价的是两个对象的地址值
           this是谁?那个对象调用的方法,方法中的this就是那个对象;p1调用的equals方法所以this就是p1
           obj是谁?传递过来的参数p2
           this==obj -->p1==p2
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

        /*
        Object类的equals方法,默认比较的是两个对象的地址值,没有意义
        所以我们要重写equals方法,比较两个对象的属性(name,age)
        问题:
            隐含着一个多态
            多态的弊端:无法使用子类特有的内容(属性和方法)
            Object obj = p2 = new Person("古力娜扎",19);
            解决:可以使用向下转型(强转)把obj类型转换为Person
     */
    /*
    @Override
    public boolean equals(Object obj) {

        //增加一个判断,传递的参数obj如果是null,直接返回false,提高程序的效率
        if (obj == null) {
            return false;
        }

        //增加一个判断,传递的参数obj如果是this本身,直接返回true,提高程序的效率
        else if (this == obj) {
            return true;
        }
        //增加一个判断,防止类型转换一次 ClassCastException
        else if (obj instanceof Person) {
            // 使用向下转型(强转)把obj类型转换为Person
            Person p = (Person) obj;
            // 比较连个对象的属性；一个是调用方法的this，一个是转型之后的p
            return this.name.equals(p.name) && (this.age == p.age);
        } else {
            return false;
        }
    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        // getClass() != o.getClass() 使用反射技术,判断o是否是Person类型  等效于 obj instanceof Person
        // 使用 IDEA 自动生成的那个比较好
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}

import java.util.Collections;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/16 18:45
 * @Author : NekoSilverfox
 * @FileName: Person
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class Person implements Comparable<Person> {  // 注意，这里要加 implements Comparable<Person>
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 重写排序规则
    @Override
    public int compareTo(Person o) {
        // return 0;//认为元素都是相同的
        //自定义比较的规则,比较两个人的年龄(this,参数Person)
//        return this.getAge() - o.getAge();  // 年龄升序排序
        return o.getAge() - this.getAge();  // 年龄降序排序
    }


    public String getName() {
        return name;
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
}

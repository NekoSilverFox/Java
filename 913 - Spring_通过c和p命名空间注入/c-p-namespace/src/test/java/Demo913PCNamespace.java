import com.foxthere.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/3 23:50
 * @Author : NekoSilverfox
 * @FileName: Demo913PCNamespace
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class Demo913PCNamespace {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Student silverfox = context.getBean("Silverfox", Student.class);// 【重点】这里可以指定一个class，这样就不用强转了
        System.out.println(silverfox.toString());

        Student fox = context.getBean("Fox", Student.class);
        System.out.println(fox.toString());
    }
}

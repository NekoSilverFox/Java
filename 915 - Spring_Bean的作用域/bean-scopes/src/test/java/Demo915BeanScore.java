import com.foxthere.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/4 0:53
 * @Author : NekoSilverfox
 * @FileName: Demo915BeanScore
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class Demo915BeanScore {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Student silverfox = context.getBean("Silverfox", Student.class);
        Student silverfox2 = context.getBean("Silverfox", Student.class);
        System.out.println(silverfox.hashCode());
        System.out.println(silverfox2.hashCode());
    }
}

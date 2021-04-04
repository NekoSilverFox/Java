import com.foxthere.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/4 19:16
 * @Author : NekoSilverfox
 * @FileName: DemoAnnotation
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
    }
}

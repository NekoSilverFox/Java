import com.foxthere.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/3 12:29
 * @Author : NekoSilverfox
 * @FileName: Demo909Constructor
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class Demo909Constructor {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = (User) context.getBean("user");
        user.show();
    }
}

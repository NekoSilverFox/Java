import com.foxthere.User;
import com.foxthere.UserT;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = (User) context.getBean("user");  // 【创建】在创建一个的同时UserT也被一起创建了，所以说在配置文件加载时，容器中管理的对象就已经初始化了
        user.show();

        System.out.println("===============================");

        User user2 = (User) context.getBean("user3");
        user2.show();
        System.out.println(user2 == user);  // true 【重点】说明只实例化了一份对象

        System.out.println("===============================");

        // 使用别名获取到这个对象
        UserT alias_userT = (UserT) context.getBean("alias_userT");
        alias_userT.show();
    }
}

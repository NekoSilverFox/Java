import com.foxthere.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/5 22:47
 * @Author : NekoSilverfox
 * @FileName: DemoSpringAOP
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoSpringAOP {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // 动态代理实现的是接口，相当于返回的是被创建的代理类
        // 所以新生成的代理类只能向上转型为接口类型，不能同等级强转给UserServiceImpl
        UserService userService = (UserService) context.getBean("userService");

        userService.add();
    }
}

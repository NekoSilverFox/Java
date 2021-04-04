import com.foxthere.config.UserConfig;
import com.foxthere.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/4 23:07
 * @Author : NekoSilverfox
 * @FileName: DemoConfiguration
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoConfiguration {
    public static void main(String[] args) {

        // 如果完全使用了配置类的方式去做，我们就只能通过 ApplicationContext 上下文来获取容器，通过配置类的class对象来加载
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User user = (User) context.getBean("getUser2");
        System.out.println(user.getName());

    }
}

import com.foxthere.Profile.DataSource;
import com.foxthere.Profile.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.DatagramSocket;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/18 15:39
 * @Author : NekoSilverfox
 * @FileName: DemoXMLandJava
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 * 924 - Spring_使用XML与Java混合配制
 */

public class DemoXMLandJava {
    public static void main(String[] args) {
        // 注意：如果是混合的话，需要用 java 的方式获取
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        DataSource prod = context.getBean("prod", DataSource.class);
        System.out.println(prod.toString());

        DataSource dev = context.getBean("dev", DataSource.class);
        System.out.println(dev.toString());
    }
}

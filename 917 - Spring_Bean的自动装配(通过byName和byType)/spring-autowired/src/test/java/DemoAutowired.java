import com.foxthere.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/4 10:14
 * @Author : NekoSilverfox
 * @FileName: DemoAutowired
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class DemoAutowired {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Person silverfox = context.getBean("Silverfox", Person.class);
        silverfox.getCat().shout();
        silverfox.getDog().shout();
    }

}

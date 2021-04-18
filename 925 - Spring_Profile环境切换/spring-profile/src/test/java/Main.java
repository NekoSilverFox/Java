import com.foxthere.Profile.DataSource;
import com.foxthere.Profile.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/4/18 14:29
 * @Author : NekoSilverfox
 * @FileName: Main
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        // 设置环境信息
        ctx.getEnvironment().setActiveProfiles("prod");

        // 设置 Java 配置文件
        ctx.register(JavaConfig.class);

        // 刷新一下
        ctx.refresh();

        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.toString());
    }

}

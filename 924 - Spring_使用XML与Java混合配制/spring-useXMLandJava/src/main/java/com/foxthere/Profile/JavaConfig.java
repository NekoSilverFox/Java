package com.foxthere.Profile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

@Configuration

// 如果要使用混合的方法配置，需要在Java配置中要加入这么一行，使得把XML导入进来
@ImportResource("classpath:ApplicationContext.xml")
public class JavaConfig {

    @Bean("dev")
    DataSource devDs() {
        DataSource ds = new DataSource();
        ds.setUrl("jdbc:mysql:///vhr");
        ds.setUserName("root");
        ds.setPasswd("root123");

        return ds;
    }

}

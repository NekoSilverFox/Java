package com.foxthere.Profile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class JavaConfig {

    @Bean
    @Profile("dev")
    DataSource devDs() {
        DataSource ds = new DataSource();
        ds.setUrl("jdbc:mysql:///vhr");
        ds.setUserName("root");
        ds.setPasswd("root123");

        return ds;
    }

    @Bean
    @Profile("prod")
    DataSource prodDs() {
        DataSource ds = new DataSource();
        ds.setUrl("j192.168.2.1:3306/vhr");
        ds.setUserName("root");
        ds.setPasswd("sdgsdfsdfsdfa");

        return ds;
    }
}

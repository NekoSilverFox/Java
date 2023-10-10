/**
 * Необходимо написать две программы (клиент и сервер) с использованием библиотеки Spring Boot.
 * Клиент должен вызывать API сервера, используя прокси Zuul.
 * Также в рамках лабораторной работы необходимо написать пользовательский фильтр Zuul.
 *
 * 客户端应使用 Zuul 代理调用服务器 API
 * 还需要编写一个自定义 Zuul 过滤器
 * https://www.jianshu.com/p/e0434a421c03
 */

package com.bigdata.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}

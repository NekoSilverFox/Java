package com.bigdata.client;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.config.ConnectionConfig;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManagerBuilder;
import org.apache.hc.client5.http.ssl.NoopHostnameVerifier;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactory;
import org.apache.hc.client5.http.ssl.TrustSelfSignedStrategy;
import org.apache.hc.core5.ssl.SSLContextBuilder;
import org.apache.hc.core5.util.Timeout;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.io.InputStream;
import java.security.KeyStore;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();

		KeyStore keyStore;
		HttpComponentsClientHttpRequestFactory requestFactory;

		try {
			keyStore = KeyStore.getInstance("jks");
			ClassPathResource classPathResource = new ClassPathResource("gateway.jks");
			InputStream inputStream = classPathResource.getInputStream();
			keyStore.load(inputStream, "password".toCharArray());
			SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(new SSLContextBuilder()
					.loadTrustMaterial(null, new TrustSelfSignedStrategy())
					.loadKeyMaterial(keyStore, "password".toCharArray()).build(),
					NoopHostnameVerifier.INSTANCE);


//			HttpClient httpClient = HttpClients.custom().setSSLSocketFactory(socketFactory)
//					.setMaxConnTotal(5)
//					.setMaxConnPerRoute(5)
//					.build();


			/* HttpClient 5 - https://hc.apache.org/httpcomponents-client-5.2.x/migration-guide/migration-to-classic.html */
			PoolingHttpClientConnectionManager connectionManager = PoolingHttpClientConnectionManagerBuilder.create()
					.setSSLSocketFactory(socketFactory)
					.setMaxConnTotal(5)
					.setMaxConnPerRoute(5)
					.setDefaultConnectionConfig(ConnectionConfig.custom()
							.setSocketTimeout(Timeout.ofMinutes(1))
							.setConnectTimeout(Timeout.ofMinutes(1)).build())
					.build();

			HttpClient httpClient = HttpClients.custom().setConnectionManager(connectionManager).build();

			requestFactory = new HttpComponentsClientHttpRequestFactory();
			requestFactory.setHttpClient(httpClient);
//			requestFactory.setReadTimeout(10000);
//			requestFactory.setConnectTimeout(10000);

			restTemplate.setRequestFactory(requestFactory);
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}
		return restTemplate;
	}
}
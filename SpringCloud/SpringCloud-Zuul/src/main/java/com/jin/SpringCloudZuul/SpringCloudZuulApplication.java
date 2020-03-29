package com.jin.SpringCloudZuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

// ZUUL을 Eureka Client로 설정하는 이유 : 
// Eureka Server에 등록된 서비스들의 정보를 ZUUL에 캐싱하여 ZUUL을 통해 엔드포인트에 접근하기 위해.
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulApplication.class, args);
	}

}

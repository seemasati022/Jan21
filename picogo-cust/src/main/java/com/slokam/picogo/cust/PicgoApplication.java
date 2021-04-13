package com.slokam.picogo.cust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableEurekaClient
@EnableResourceServer
//@SpringBootTest(classes=PicgoApplication.class)

public class PicgoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicgoApplication.class, args);
	}

}
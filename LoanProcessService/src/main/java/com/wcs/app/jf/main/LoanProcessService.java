package com.wcs.app.jf.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LoanProcessService {

	public static void main(String[] args) {
		SpringApplication.run(LoanProcessService.class, args);
	}

}

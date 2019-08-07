package com.wcs.app.jf.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@EnableJpaRepositories
@SpringBootApplication
@EntityScan
public class MasterServiceApplication 
{

	public static void main(String[] args)
	{
		SpringApplication.run(MasterServiceApplication.class, args);
	}

}

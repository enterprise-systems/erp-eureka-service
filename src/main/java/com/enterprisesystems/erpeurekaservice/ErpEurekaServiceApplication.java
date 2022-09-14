package com.enterprisesystems.erpeurekaservice;

import java.time.ZonedDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class ErpEurekaServiceApplication {

	public static void main(String[] args) {
		log.info("ERP Eureka Service Application starting at: {}", ZonedDateTime.now().toString());
		SpringApplication.run(ErpEurekaServiceApplication.class, args);
	}

}

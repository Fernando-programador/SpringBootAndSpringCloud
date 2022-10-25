package com.microServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.cloud.openfeign.EnableFeignClients;
//@RibbonClient(name = "hr-worker") // de quem ele é cliente?


//@EnableCircuitBreaker
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class HrFolhaPagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrFolhaPagamentoApplication.class, args);
	}

}

package com.microServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@RibbonClient(name = "hr-worker")
public class HrFolhaPagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrFolhaPagamentoApplication.class, args);
	}

}

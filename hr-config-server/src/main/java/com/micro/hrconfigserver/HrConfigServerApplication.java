package com.micro.hrconfigserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HrConfigServerApplication implements CommandLineRunner{

	@Value("${spring.cloud.config.server.git.username}")
	private String username;
	
	@Value("${spring.cloud.config.server.git.password}")
	private String senha;
	
	public static void main(String[] args) {
		SpringApplication.run(HrConfigServerApplication.class, args);
	}
	
	
	/*
	 * para tesatar se o modo private do github esta funcionando implementei o commmandlineruune na clase
	 * criei o metodo a baixo
	 * coloque o value acima
	 * meu github não funciona pois tenho a senha de dois fatores
	 */
	@Override
	public void run(String... args) throws Exception {
		System.out.println("USERNAME = " + username);
		System.out.println("PASS = " + senha);
	}

}

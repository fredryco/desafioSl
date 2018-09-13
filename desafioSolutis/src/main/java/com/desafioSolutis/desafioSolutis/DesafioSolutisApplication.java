package com.desafioSolutis.desafioSolutis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioSolutisApplication {

	private static final Logger logger = LoggerFactory.getLogger(DesafioSolutisApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(DesafioSolutisApplication.class, args);
	}
}

package com.desafioSolutis.desafioSolutis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.desafioSolutis.controller.PalavraController;
import com.desafioSolutis.model.PalavraEntity;
import com.desafioSolutis.repositorio.PalavraRepositorio;
import com.desafioSolutis.service.PalavraServiceImplementacao;

@SpringBootApplication
@ComponentScan(basePackageClasses = PalavraController.class)
@EntityScan(basePackageClasses = PalavraEntity.class)
@EnableJpaRepositories(basePackageClasses = PalavraRepositorio.class)
public class DesafioSolutisApplication {

	private static final Logger logger = LoggerFactory.getLogger(DesafioSolutisApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(DesafioSolutisApplication.class, args);
	}
	
	@Bean
    public PalavraServiceImplementacao palavraServiceImplementacao() {
        return new PalavraServiceImplementacao ();
    }
	
}

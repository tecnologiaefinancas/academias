package com.tecnologiaefinancas.academias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.tecnologiaefinancas.academias.repository")
public class AcademiasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademiasApplication.class, args);

	}


}

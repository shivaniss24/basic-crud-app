package com.project.basiccrudapp;

import com.project.basiccrudapp.repository.CrudRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.project.basiccrudapp.repository")
public class BasicCrudAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(BasicCrudAppApplication.class, args);
	}

}

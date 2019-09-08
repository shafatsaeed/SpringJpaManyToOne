package com.example.SpringDataJPAManyToOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages={"com.example.model"})
@ComponentScan(basePackages= {"com.example"})
@EnableJpaRepositories("com.example.repository")
public class SpringDataJpaManyToOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaManyToOneApplication.class, args);
	}

}

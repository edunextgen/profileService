package com.edunextgen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan
@EnableAutoConfiguration
//@EnableJpaRepositories("com.edunextgen.repository")
public class UsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);
	}

}

//@EnableJpaRepositories(basePackages = {"com.edunextgen.entity", "com.edunextgen.repository"})


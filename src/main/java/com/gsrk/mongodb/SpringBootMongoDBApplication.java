package com.gsrk.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages= {"com.gsrk.mongodb.repository"})
@ComponentScan(basePackages= {"com.gsrk.mongodb"})
public class SpringBootMongoDBApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDBApplication.class,args);
	}

}
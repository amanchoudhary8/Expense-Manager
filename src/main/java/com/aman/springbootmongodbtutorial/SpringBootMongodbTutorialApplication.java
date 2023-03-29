package com.aman.springbootmongodbtutorial;

import io.mongock.runner.springboot.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongock
public class SpringBootMongodbTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongodbTutorialApplication.class, args);
	}

}

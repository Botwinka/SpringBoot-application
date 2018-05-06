package com.spring.tutorial.springDemo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

	@Bean
	ApplicationRunner init(DogRepository dogRepository){
		return args -> {
			Stream.of("Labrador", "Pudle", "York")
					.forEach(name -> crateAndSaveDogValues(dogRepository, name));
			dogRepository.findAll().forEach(System.out::println);
		};
	}

	private void crateAndSaveDogValues(DogRepository dogRepository, String name) {
		Dog dog = new Dog();
		dog.setName(name);
		dogRepository.save(dog);
	}
}

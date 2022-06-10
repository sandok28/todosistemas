package com.prueba;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosistemasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TodosistemasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Holaaaaa");
		
	}

}

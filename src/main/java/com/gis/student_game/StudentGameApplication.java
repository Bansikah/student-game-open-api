package com.gis.student_game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class StudentGameApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(StudentGameApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
		app.run(args);

	}

}

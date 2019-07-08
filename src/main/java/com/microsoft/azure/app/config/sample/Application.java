package com.microsoft.azure.app.config.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.Collections;

@SpringBootApplication
@EnableConfigurationProperties(MessageProperties.class)

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		/*SpringApplication app = new SpringApplication(Application.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8083"));
		app.run(args);*/

	}

}

package io.github.robwin.endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.github.robwin.endpoint")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

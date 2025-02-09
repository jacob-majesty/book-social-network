package com.majesty.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@EnableAsync
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.majesty.book")
public class BookNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookNetworkApplication.class, args);
	}

}

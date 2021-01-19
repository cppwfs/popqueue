package io.spring.popqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PopqueueApplication {

	@Autowired
	private PopqueueController controller;

	public static void main(String[] args) {
		SpringApplication.run(PopqueueApplication.class, args);
	}


	@Bean
	public Consumer<String> testtock() {
		return val -> {
			System.out.println(val);
			controller.getQueue().add(val);
		};
	}
}

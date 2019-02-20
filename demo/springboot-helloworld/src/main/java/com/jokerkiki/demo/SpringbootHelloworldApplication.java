package com.jokerkiki.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 本例只有启动后调用controller的方式，作为springboot hello world
 *
 *
 */
@SpringBootApplication
public class SpringbootHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloworldApplication.class, args);
	}

}

package com.jokerkiki.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author 70719
 * springboot集成mybaits
 */
@SpringBootApplication
@MapperScan("com.jokerkiki.demo.dao")
public class SpringbootMybaitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybaitsApplication.class, args);
	}

}

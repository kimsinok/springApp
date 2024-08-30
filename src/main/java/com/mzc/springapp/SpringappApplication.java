package com.mzc.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringappApplication {

	public static void main(String[] args) {
		log.info("SpringappApplication");
		SpringApplication.run(SpringappApplication.class, args);
	}

}

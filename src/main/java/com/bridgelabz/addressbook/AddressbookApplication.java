package com.bridgelabz.addressbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressbookApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AddressbookApplication.class, args);
		log.info("Addrress book app started");
		log.info("Addrress book DB User is {}",
				context.getEnvironment().getProperty("spring.datasource.username"));
	}

}
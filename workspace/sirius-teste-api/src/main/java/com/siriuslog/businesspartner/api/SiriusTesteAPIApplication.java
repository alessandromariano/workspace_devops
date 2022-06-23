package com.siriuslog.businesspartner.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.siriuslog.businesspartner")
public class SiriusTesteAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiriusTesteAPIApplication.class, args);
	}
}

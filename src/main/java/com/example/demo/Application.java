package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.karan.jjdjdjdj;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ct = SpringApplication.run(Application.class, args);
		jjdjdjdj d = ct.getBean(jjdjdjdj.class);
	}

}

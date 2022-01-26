package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication(scanBasePackages={
		"com.example.demo.controller", "com.example.application","com.example.demo.modelo","com.example.demo.repositorio","com.example.demo.servicios"})
public class EstacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstacionesApplication.class, args);
	}

}

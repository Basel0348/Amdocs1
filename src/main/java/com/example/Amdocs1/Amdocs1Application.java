package com.example.Amdocs1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Amdocs1.domain.logFile;
import com.example.Amdocs1.domain.logFileRepository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication

public class Amdocs1Application {
	@Autowired 
    private logFileRepository repository;

	 private static final Logger logger = LoggerFactory.getLogger(Amdocs1Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Amdocs1Application.class, args);
		logger.info("Hello Spring Boot");
	}

      
}


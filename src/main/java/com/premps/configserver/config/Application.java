package com.premps.configserver.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * This class is the starting point of configuring and setting up the Spring
 * Cloud Config Server. <br>
 * By annotating the class with the @EnableConfigServer annotation, Spring
 * automatically does the set up of the server hence this and the properties in
 * the bootstrap.yml file are the only things needed to be done for the server
 * to be functional.
 * 
 * @author Prempeh Gyan
 * @version 1.0
 * 
 */
@EnableConfigServer
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

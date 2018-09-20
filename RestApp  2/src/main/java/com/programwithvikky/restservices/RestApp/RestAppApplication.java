package com.programwithvikky.restservices.RestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // called an annotation where it speeds up our development process of configuring and writing a bunch of boiler plates
public class RestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestAppApplication.class, args); // this line basically runs our application and runs our server for us!
		// runs it on localhost:8080
	}
}

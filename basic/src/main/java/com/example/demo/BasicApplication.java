package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		ApplicationContext contex = SpringApplication.run(BasicApplication.class, args);
		 
		 //normal class making in java
		 Alean a = new Alean();
		 a.hello();
		 
		 //in spring 
		 Alean a1 = contex.getBean(Alean.class);
	}
}

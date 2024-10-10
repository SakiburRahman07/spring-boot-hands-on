package com.sakib.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);
		//Alien obj = new Alien();
		Alien obj = context.getBean(Alien.class);
		obj.build();
	}

}

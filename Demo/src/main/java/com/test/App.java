package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class App {

	@RequestMapping("/")
    String home() {
        return "Hello SpringBoot Demo!";
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 SpringApplication.run(App.class, args);
	}

}

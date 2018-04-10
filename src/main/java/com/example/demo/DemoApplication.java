package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
	@SpringBootApplication
	public class DemoApplication {
		@Autowired
		private BookBean bookBean;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@RequestMapping(value = "/book", produces = "text/plain;charset=UTF-8")
	String index(){

		return "Hello Spring Boot!"+"作者："+bookBean.getAuthor();
	}
}

package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.beans.factory.annotation.Value;



@RestController
public class HelloWorldController {
//@Value("${app.smtp.name}")
	//private String smtpName;
	
	@RequestMapping("/hello")
	public String hello() {
		return "HELLO";
	}
	@RequestMapping("/method")
	public String method() {
		return "METHOD";
	}

}

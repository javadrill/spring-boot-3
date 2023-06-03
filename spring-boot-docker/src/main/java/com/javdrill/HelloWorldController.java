package com.javdrill;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

	@GetMapping("/hello-world")
	public String helloWorldMsg() {
		logger.info("Inside helloWorldMsg method.");
		return "Welcome on javadrill.com";
	}
}

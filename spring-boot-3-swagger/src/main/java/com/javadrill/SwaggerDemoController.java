package com.javadrill;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class SwaggerDemoController {

	@GetMapping(path = "/hello-world")
	public String getWelcomeMsg() {
		return "Welcome to Hello word example.";
	}
}
package com.stacksimplify.ccdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/welcome")
	public String sayHello() {
		return "Manual Approval Stage and Prod Deployment - v2";
	}
	
}

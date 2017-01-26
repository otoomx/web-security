package com.example;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	public TestController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@RequestMapping("/hello")
	public String hello(){
		return "no auth hellow";
	}
	
	@RequestMapping(value={"/secure/hello", "/api/hello"})
	public String helloAuth( Principal principal){
		return "auth hellow " + principal.getName();
	}

}

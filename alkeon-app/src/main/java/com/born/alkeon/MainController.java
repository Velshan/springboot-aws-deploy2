package com.born.alkeon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {
	
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Calling from AWS";
	}
	
	@GetMapping("/get")
	public String get() {
		return "Calling from AWS-not";
	}
	
	

}

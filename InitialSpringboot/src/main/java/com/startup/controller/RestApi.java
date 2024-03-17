package com.startup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RestApi {
	
	@GetMapping("/getInfo")
	public String getInformation() {
		return "It's Working...";
	}
	

}

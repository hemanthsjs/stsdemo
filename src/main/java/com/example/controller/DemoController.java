package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.Service;

@RestController
public class DemoController {

	@Autowired
	Service ssr;
	
	@GetMapping("/m1")
	public String m1() {
		String msg = ssr.m1();
		return msg;
	}
	
	
}

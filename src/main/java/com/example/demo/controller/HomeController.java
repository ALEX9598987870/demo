package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mojango")
public class HomeController {

	@GetMapping("/meuovo")
	private String home() {
		return  "/home";
	}
	
	@GetMapping("cachacacarai")
	private String sobre() {
		return "/about";
	}
}

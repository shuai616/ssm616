package com.oracle.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
@RequestMapping("/hello")
public String test(){
		System.out.println("kzq!beidiaoyong");
	return "success";
	
}
}

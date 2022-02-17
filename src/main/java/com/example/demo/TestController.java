package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController 
{
	 @GetMapping(value="/", produces = MediaType.TEXT_PLAIN_VALUE)
	    public String index() {

	        return "This is Home page";
	    }

	    @GetMapping(value="/hello", produces = MediaType.TEXT_PLAIN_VALUE)
	    public String sayHello() {

	        return "Hello there!";
	    }

}

package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController 
{
	@GetMapping("/home")
	public String showHomePage()
	{
		
		return "home";
	}
	
	@GetMapping("/response")
	public String showResponse(Map<String,Object> model)
	{
		String[] booksName=new String[] {"Java","Spring Boot","Hibernate"};
//		for(String book:booksName)
//		{
//			System.out.println(book);
//		}
		model.put("books", booksName);
		return "response";
	}
}

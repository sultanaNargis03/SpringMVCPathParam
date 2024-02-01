package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryController 
{
	//localhost:8486/getmessage/nargis
	//localhost:8486/getmessage/nargis/SpringBoot
	@GetMapping("/getmessage/{name}/{course}")
	public String displayMessage(@PathVariable("name")String name,@PathVariable("course")String course,
			Map<String, Object> model)
	{
		String msg="Hello! "+name+" I hope you're enjoying the "+course+" course";
		model.put("msg", msg);
		return "index";
	}
}

package demo.boot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.boot.service.ISimpleService;

@RestController
public class SimpleController {

	@Autowired
	ISimpleService simpleService;
	
	@GetMapping
	public String getMsg()
	{
		
		return "Have "+simpleService.getMsg();
	}
	
	@GetMapping("info")
	public String getInfo()
	{
		return "This is developed in Spring Boot";
	}
}

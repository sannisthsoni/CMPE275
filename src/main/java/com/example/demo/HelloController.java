package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
		Greet obj = (Greet) context.getBean("greeter");
		return obj.getName();
	}

}

package com.yuanjing.controller;

import com.yuanjing.service.HelloService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController implements ApplicationContextAware {

	private ApplicationContext context;

	@Autowired(required = false)
	HelloService helloService;

	@GetMapping("/a")
	@ResponseBody
	public String test(){
		System.out.println(context);
		helloService.sayHello();

		try{
			Object o1 = context.getBean("helloController");

			Object o2 = context.getBean("hello2Controller");

		}catch (Exception e){
			e.printStackTrace();
		}



		return "hello yuanjing";
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		ApplicationContext parent = applicationContext.getParent();
		System.out.println(parent);

		this.context = applicationContext;


	}
}

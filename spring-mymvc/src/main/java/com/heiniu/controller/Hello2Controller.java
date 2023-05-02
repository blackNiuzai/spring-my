package com.heiniu.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello2Controller implements ApplicationContextAware {

	private ApplicationContext context;

	@GetMapping("/a")
	@ResponseBody
	public String test(){

		try{
			Object o1 = context.getBean("helloController");

			Object o2 = context.getBean("hello2Controller");

		}catch (Exception e){
			e.printStackTrace();
		}

		return "hello heiniu";
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;


	}


}

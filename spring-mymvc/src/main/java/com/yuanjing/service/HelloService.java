package com.yuanjing.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class HelloService implements InitializingBean {

	public void sayHello(){
		System.out.println("say hello");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("初始化ok");
	}
}

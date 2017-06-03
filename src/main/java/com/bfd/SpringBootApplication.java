package com.bfd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bfd.configuration.BfdConfig;
import com.bfd.service.UseFunctionService;

public class SpringBootApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BfdConfig.class);
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		String result = useFunctionService.sayHello("BFD");
		System.out.println("result:" + result);
		context.close();
	}
}

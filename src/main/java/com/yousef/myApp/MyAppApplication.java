package com.yousef.myApp;

import com.yousef.myApp.services.FirstService;
import com.yousef.myApp.services.SecondService;
import com.yousef.myApp.services.ServiceConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);

		FirstService firstService =  context.getBean(FirstService.class);
		SecondService secondService = context.getBean(SecondService.class);
		System.out.println(firstService.getMessage());
		System.out.println(secondService.getMessage());

		ServiceConsumer serviceConsumer = context.getBean(ServiceConsumer.class);
		serviceConsumer.displayMessages();
	}

}

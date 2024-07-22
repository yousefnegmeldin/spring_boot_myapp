package com.yousef.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);

		ChickenPizza chickenPizza = context.getBean(ChickenPizza.class);
		chickenPizza.bakePizza();
		chickenPizza.setToppingName("Chicken");
		chickenPizza.addingTopping();
		chickenPizza.printToppingName();

		VegPizza vegPizza = context.getBean(VegPizza.class);
		vegPizza.addingTopping();
	}

}

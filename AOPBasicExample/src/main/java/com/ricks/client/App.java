package com.ricks.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ricks.service.CustomerService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ricks/cfgs/myBean.xml");
		CustomerService customerService = (CustomerService) context.getBean("customerServiceProxy");

		System.out.println(customerService.printName("Ricky"));
		System.out.println(customerService.printUrl());
		try {
			customerService.printException();
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}
}

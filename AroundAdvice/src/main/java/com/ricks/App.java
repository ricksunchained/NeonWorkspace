package com.ricks;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ricks.security.UserAuthorization;
import com.ricks.service.AccountService;

public class App {

	public static void main(String[] args) {
		Logger log = Logger.getLogger(App.class);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ricks/cfgs/myConfig.xml");
		AccountService accountService = applicationContext.getBean("accountServiceProxy", AccountService.class);
		if (accountService.deposit(301, 2000.0) > 0) {
			System.out.println("Deposite Successfull");
			log.info("Deposite Successfull");
		}
		if (accountService.withdraw(301, 1000.0) > 0) {
			System.out.println("Withdraw Successfull");
			log.info("Withdraw Successfull");
		}
	}
}

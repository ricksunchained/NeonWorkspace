package com.ricks.server;

import javax.jws.WebService;

@WebService
public class HelloServiceImpl implements HelloService {

	public String sayHello(String name) {

		return "Hello " + name + "Welcome to Jaxws";
	}

}

package com.ricks.server;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class ApplicationClass extends Application {

	private static Set<Object> resource = new HashSet<Object>();

	public ApplicationClass() {
		resource.add(new RestBasicServer());
	}

	@Override
	public Set<Object> getSingletons() {
		return resource;
	}

}
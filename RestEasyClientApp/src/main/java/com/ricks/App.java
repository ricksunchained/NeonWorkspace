package com.ricks;

import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		String url = "http://localhost:8080/RestEasyServerApp/hello/sayHello?name=ricky";
		ClientRequest clientRequest = new ClientRequest(url);
		clientRequest.accept(MediaType.TEXT_PLAIN);
		ClientResponse response = clientRequest.get(ClientResponse.class);
		System.out.println(response.getEntity(String.class).toString());
	}
}

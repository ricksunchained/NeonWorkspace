package com.ricks.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ricks.domain.Book;
import com.ricks.domain.ResposeDTO;
import com.ricks.service.BookServiceFactory;
import com.ricks.util.JsonUtil;

@Path("books")
public class BookResource {

	@Produces(value = { MediaType.APPLICATION_JSON })
	@POST
	@Path("/registerBook")
	@Consumes(MediaType.APPLICATION_JSON)
	public ResposeDTO registerBook(String jsonString) {
		int count = 0;
		String message = "Book did not registered due to server issue.";
		ResposeDTO resposeDTO = new ResposeDTO();
		Book book = JsonUtil.convertJsonToJava(jsonString, Book.class);
		count = BookServiceFactory.getInstance().registerBook(book);
		if (count > 0) {
			resposeDTO.setStatus(1);
			resposeDTO.setIsbn(book.getIsbn());
			message = "Book registered successfully with isbn id" + book.getIsbn();
		} else {
			message = "Book Did not registered successfully....plz try again";
		}
		System.out.println("server response:" + message);
		resposeDTO.setMessage(message);
		return resposeDTO;
	}
}

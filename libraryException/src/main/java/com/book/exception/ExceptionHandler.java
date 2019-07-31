package com.book.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.model.Book;
import com.book.validation.FieldValidation;

@Component
public class ExceptionHandler {
	
	@Autowired
	FieldValidation fieldValidate;

	public Book create(Book book) throws Exception {
		 Book value=null;
		try 
		{
		value=fieldValidate.validPrice(book); 
		value=fieldValidate.findAuthorName(book); 
		}
		catch(Exception e)
		{
			System.err.println("Got an exception!");
			System.err.println(e.getMessage());	
			
			throw e;

		}
		return value;
	}
}
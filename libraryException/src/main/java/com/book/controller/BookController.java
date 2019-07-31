package com.book.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.book.model.Book;
import com.book.service.BookService;


@RequestMapping("library")
@RestController
public class BookController {

	@Autowired
	BookService bookService;
	
	@PostMapping
	public Book create (@RequestBody Book book) throws Exception 
	{
		Book v =null;
	   try {
			 v= bookService.create(book);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}	
		 
		 return v;
	}
			
}


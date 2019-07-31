package com.book.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.exception.ExceptionHandler;
import com.book.model.Book;

@Service
public class BookService {
	
	@Autowired
	ExceptionHandler exceptionHandler;
	
	public Book create(Book book) throws Exception {
		Book b = null;
		 try {
			b= exceptionHandler.create(book);
		} 
		 catch (Exception e) {
			
//			 TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		return b;
	}
	
	}
	


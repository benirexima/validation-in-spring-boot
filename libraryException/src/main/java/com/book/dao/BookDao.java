package com.book.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.model.Book;
import com.book.repository.BookRepository;

@Component
public class BookDao {

	@Autowired
	BookRepository bookRepository;
	
	
	public Book create (Book book) throws Exception {
		Book k=null;
		try
		{
		
		 k= bookRepository.save(book);
	} 
		catch (Exception e) {
			
//			 TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
			
	return k;
		 
   
}
}

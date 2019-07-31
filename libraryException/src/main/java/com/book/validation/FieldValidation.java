package com.book.validation;

import javax.naming.NameNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.dao.BookDao;
import com.book.model.Book;

@Component
public class FieldValidation {
	
	@Autowired
	BookDao bookDao;
	
	public Book validPrice(Book book) throws Exception {
		
		double price=book.getPrice();
		
		if (price >= 150 && price<= 500) {
			
			System.out.println("book is added");
		}
		
		else {
			throw new Exception("price is not between 150 and 500");
			
		}
		return book;			
	}
	public  Book findAuthorName (Book book) throws NameNotFoundException{ 
		
		String authorName=book.getAuthorname();
		
		if ("aravinth".equals(authorName)) {
			
			System.out.println("author name is correct");
		}
		else {
			
            throw new NameNotFoundException("Name is not match!");
		}
        return book;
	}

}

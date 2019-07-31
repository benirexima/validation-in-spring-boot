package com.book.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import org.springframework.data.annotation.Id; 


@Entity
public class Book {
	 @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
	private Long bookid;
	 
	@NotNull(message="please enter the book name")
	@Size(min=2, max=6)
	private String bookname;
	
	@NotNull(message="please enter the author name")
	private String authorname;
	
	@NotNull(message="please enter the price")
	private double price;
	
	
	
	public Long getBookid() {
		return bookid;
	}
	public void setBookid(Long bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", authorname=" + authorname + ", price=" + price
				+ "]";
	}
	
	
	

}

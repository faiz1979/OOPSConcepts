package com.in28minutes.oops.level2;

import java.util.ArrayList;

public class Book {
	
	private int bookId ;
	private String nameOfBook;
	private String authorOfTheBook;
	private ArrayList<Review> reviews = new ArrayList<>();
	public Review addReview;

	public Book(int bookId, String nameOfBook, String authorOfTheBook) 
	{
		this.bookId = bookId;
		this.nameOfBook = nameOfBook;
		this.authorOfTheBook = authorOfTheBook;
		
	}
	
	public void addReview(Review review)
	{
		this.reviews.add(review);
	}
	
	public String toString()
	{
		return String.format("id = %d name = %s author = %s Reviews = %s", bookId, nameOfBook, authorOfTheBook, addReview);
	}

}

package com.in28minutes.oops.level2;

public class Review {
	private int id;
	private String comments;
	private int rating;
	
	public Review(int id, String comments, int rating)
	{
		this.id = id;
		this.comments = comments;
		this.rating = rating;
	}
	
	public String addReview()
	{
		return (id + " " + comments + " " + rating);
	}
	
	public String toString()
	{
		return (id + " " + comments + " " + rating);
	}


}

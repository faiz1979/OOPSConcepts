package com.in28minutes.oops.level2;

public class Rectangle {
	
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public String toString()
	{
		
		return String.format("lenghth - %f, breadth - %f", length, breadth);
	}
	
	public float areaOfRectangle()
	{
	
	float area;
	area = (float) (length * breadth);
	return area;
	}
	
	public float perimeterOfRectangle()
	{
	
	float perimeter;
	perimeter =  2 * (float)(length + breadth);
	return perimeter;
	}

}

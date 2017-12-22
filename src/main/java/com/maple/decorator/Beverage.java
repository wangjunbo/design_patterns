package com.maple.decorator;

public abstract class Beverage {
	String description = "Unknow Beverage";
	
	public String getDescription()
	{
		return this.description;
	}
	
	public abstract double cost();
}

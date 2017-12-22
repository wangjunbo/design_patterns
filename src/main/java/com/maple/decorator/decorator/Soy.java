package com.maple.decorator.decorator;

import com.maple.decorator.Beverage;

public class Soy extends CondimentDecorator {
	
	public Soy(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " , Soy";
	}

	@Override
	public double cost() {
		return 0.25 + beverage.cost();
	}
}

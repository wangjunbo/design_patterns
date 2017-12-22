package com.maple.decorator.decorator;

import com.maple.decorator.Beverage;

public class Whip extends CondimentDecorator {
	
	public Whip(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " , Whip";
	}

	@Override
	public double cost() {
		return 0.10 + beverage.cost();
	}

}

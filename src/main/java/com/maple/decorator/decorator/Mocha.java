package com.maple.decorator.decorator;


import com.maple.decorator.Beverage;

public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage)
	{
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription() + " , Mocha";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}



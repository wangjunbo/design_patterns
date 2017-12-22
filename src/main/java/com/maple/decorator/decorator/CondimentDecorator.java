package com.maple.decorator.decorator;

import com.maple.decorator.Beverage;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract String getDescription() ;
}

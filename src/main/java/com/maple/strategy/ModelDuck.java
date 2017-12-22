package com.maple.strategy;


import com.maple.strategy.fly.FlyNoWay;
import com.maple.strategy.quack.Quack;

public class ModelDuck extends Duck {

	public ModelDuck()
	{
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	void display() {
		System.out.println("I'm a model duck");
	}

}

package com.maple.strategy;


import com.maple.strategy.fly.FlyBehavior;
import com.maple.strategy.quack.QuackBehavior;

public abstract class Duck {
	protected QuackBehavior quackBehavior;
	protected FlyBehavior flyBehavior;
	public void performQuack()
	{
		quackBehavior.quack();
	}
	
	public void performFly()
	{
		flyBehavior.fly();
	}
	
	public void setQuackBehavior(QuackBehavior qb)
	{
		this.quackBehavior = qb;
	}
	
	public void setFlyBehavior(FlyBehavior fb)
	{
		this.flyBehavior = fb;
	}
	
	public void swim()
	{
		System.out.println("All ducks float , even decoys ");
	}
	
	abstract void display();
}

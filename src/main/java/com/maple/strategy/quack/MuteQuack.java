package com.maple.strategy.quack;

public class MuteQuack implements QuackBehavior{
	@Override
	public void quack() {
		System.out.println("<< Slience >>");
	}
}

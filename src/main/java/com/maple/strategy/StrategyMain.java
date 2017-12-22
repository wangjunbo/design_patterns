package com.maple.strategy;


import com.maple.strategy.fly.FlyRocketPowered;

public class StrategyMain {
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performQuack();
		mallardDuck.performFly();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
		
	}

}

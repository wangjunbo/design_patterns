package com.maple.command.command;

import com.maple.command.Light;

public class LightOnCommand implements Command{
	Light light;
	public LightOnCommand(Light light)
	{
		this.light = light;
	}
	@Override
	public void execute() {
		light.on();
	}
}
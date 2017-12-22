package com.maple.command.command;

import com.maple.command.Light;

public class LightOffCommand implements Command {
	Light light;
	public LightOffCommand(Light light)
	{
		this.light = light;
	}
	@Override
	public void execute() {
		light.off();
	}

}

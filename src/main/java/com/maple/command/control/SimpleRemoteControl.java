package com.maple.command.control;

import com.maple.command.command.Command;

public class SimpleRemoteControl {
	Command slot;
	public SimpleRemoteControl(){
	}
	
	public void setCommand(Command command)
	{
		slot = command;
	}
	
	public void buttonWasPressed()
	{
		slot.execute();
	}
}

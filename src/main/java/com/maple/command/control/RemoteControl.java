package com.maple.command.control;

import com.maple.command.command.Command;
import com.maple.command.command.NoCommand;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	public RemoteControl()
	{
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command command = new NoCommand();
		for (int i = 0; i < onCommands.length; i++) {
			onCommands[i] = command;
			offCommands[i] = command;
		}
	}
	
	public void setCommand(int slot , Command onCommand , Command offCommand)
	{
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot)
	{
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot)
	{
		offCommands[slot].execute();
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\n----------------------Remote Control-------------------------\n");
		for (int i = 0; i < onCommands.length; i++) {
			buffer.append("slot["+i+"]  " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
		}
		return buffer.toString();
	}
}

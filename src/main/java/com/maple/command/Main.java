package com.maple.command;


import com.maple.command.command.LightOffCommand;
import com.maple.command.command.LightOnCommand;
import com.maple.command.control.RemoteControl;
import com.maple.command.control.SimpleRemoteControl;

public class Main {
	public static void main(String[] args) {
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		remoteControl.setCommand(lightOnCommand);
//		remoteControl.buttonWasPressed();
		
		RemoteControl remoteControl2 = new RemoteControl();
		remoteControl2.setCommand(1, lightOnCommand, lightOffCommand);
		remoteControl2.onButtonWasPushed(1);
		remoteControl2.offButtonWasPushed(1);
		System.out.println(remoteControl2.toString());




		
	}
}

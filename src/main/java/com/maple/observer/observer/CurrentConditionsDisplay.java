package com.maple.observer.observer;


import com.maple.observer.WeatherData;

public class CurrentConditionsDisplay implements Observer {
	private double temperature;
	private double humidity;
	private WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData w)
	{
		this.weatherData = w;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void update(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out.println("Current conditions:"+temperature + "F degrees and " + humidity + "% humidity");
	}

}

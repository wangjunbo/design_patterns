package com.maple.observer;

import com.maple.observer.observer.Observer;

import java.util.ArrayList;


public class WeatherData {
	private ArrayList<Observer> observers;
	private double temperature;
	private double humidity;
	private double pressure;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o)
	{
		observers.add(o);
	}
	
	public void removeObserver(Observer o)
	{
		int i = observers.indexOf(o);
		if( i >= 0 )
		{
			observers.remove(i);
		}
	}
	
	public void notifyObservers()
	{
		for (int i = 0; i < observers.size(); i++) {
			Observer o = observers.get(i);
			o.update(temperature,humidity,pressure);
		}
	}
	
	public void measurementsChanged()
	{
		notifyObservers();
	}
	
	public void setMeasurements(double temperature, double humidity, double pressure)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}

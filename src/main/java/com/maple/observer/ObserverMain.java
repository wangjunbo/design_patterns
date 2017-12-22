package com.maple.observer;


import com.maple.observer.observer.CurrentConditionsDisplay;
import com.maple.observer.observer.ForecastDisplay;
import com.maple.observer.observer.StatisticsDisplay;

public class ObserverMain {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4);
	}
}

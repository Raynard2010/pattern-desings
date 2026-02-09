package main;

import model.PhoneDisplay;
import model.TVDisplay;
import model.WeatherStation;

public class Main {
	public Main() {
		// Publisher
		WeatherStation station = new WeatherStation();
		
		// Subscriber
		PhoneDisplay phone = new PhoneDisplay();
		TVDisplay tv = new TVDisplay();
		
		station.setWeather("Sunny");
		
		station.addSubscriber(phone);
		station.addSubscriber(tv);
		
		station.setWeather("Rainy");
		
		station.removeSubscriber(tv);
		
		station.setWeather("Windy");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

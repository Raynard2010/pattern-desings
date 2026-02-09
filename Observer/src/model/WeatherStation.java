package model;

import java.util.ArrayList;

import observer.Publisher;
import observer.Subscriber;

public class WeatherStation implements Publisher{
	private ArrayList<Subscriber> subscribers = new ArrayList<>();
	private String weather = "";

	@Override
	public void addSubscriber(Subscriber subscriber) {
		// tambahin subscriber ke array subscribers
		subscribers.add(subscriber);
	}

	@Override
	public void removeSubscriber(Subscriber subscriber) {
		// hapus subscriber dari array subscribers
		subscribers.remove(subscriber);
	}

	@Override
	public void notifySubscribers() {
		// TODO Auto-generated method stub
		// panggil method update di semua subscriber
		for (Subscriber subscriber : subscribers) {
			subscriber.update(weather);
		}
	}
	
	// Method perubahan di Publisher
	public void setWeather(String weather) {
		this.weather = weather;
		notifySubscribers();
	}

}

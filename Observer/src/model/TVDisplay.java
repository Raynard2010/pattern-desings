package model;

import observer.Subscriber;

public class TVDisplay implements Subscriber{
	private String weather = "";

	@Override
	public void update(String weather) {
		// TODO Auto-generated method stub
		this.weather = weather;
		display();
	}
	
	private void display() {
		System.out.println("Displaying on TV, weather: " + weather);
	}
}

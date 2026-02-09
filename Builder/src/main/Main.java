package main;

import builders.BurgerBuilder;
import directors.BurgerDirector;
import model.Burger;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		// 1. director -> paket
		BurgerDirector director = new BurgerDirector();
		
		Burger standard = director.makeStandarBurger(new BurgerBuilder());
		
		Burger simple = director.makeSimpleBurger(new BurgerBuilder());
		
		System.out.println("Standard Burger: " + standard);
		System.out.println("Simple Burger: " + simple);
		
		// 2. manual (builder aja) -> custom
		Burger custom = new BurgerBuilder()
				.reset()
				.setBun("White Bread")
				.setPatty("Pork")
				.setCheese(true)
				.setLettuce(true)
				.setTomato(false)
				.setSauce(true)
				.getResult();
		
		System.out.println("Custom Burger: " + custom);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

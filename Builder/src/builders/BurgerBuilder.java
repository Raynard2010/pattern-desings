package builders;

import model.Burger;

public class BurgerBuilder {
	// gak pake final karena nanti bakal dimodift saat building process
	
	private String bun;
	private String patty;
	private boolean cheese;
	private boolean lettuce;
	private boolean tomato;
	private boolean sauce;
	
	// reset method - supaya builder bisa direuse
	
	public BurgerBuilder reset() {
		bun = null;
		patty = null;
		cheese = false;
		lettuce = false;
		tomato = false;
		sauce = false;
		return this; // untuk method chaining
	}
	
	// method chaining = teknik di mana multiple method bisa dilink


	public BurgerBuilder setBun(String bun) {
		this.bun = bun;
		return this;
	}

	public BurgerBuilder setPatty(String patty) {
		this.patty = patty;
		return this;
	}

	public BurgerBuilder setCheese(boolean cheese) {
		this.cheese = cheese;
		return this;
	}

	public BurgerBuilder setLettuce(boolean lettuce) {
		this.lettuce = lettuce;
		return this;
	}

	public BurgerBuilder setTomato(boolean tomato) {
		this.tomato = tomato;
		return this;
	}

	public BurgerBuilder setSauce(boolean sauce) {
		this.sauce = sauce;
		return this;
	}
	
	// build method = actual burger object dibuat
	public Burger getResult() {
		return new Burger(bun, patty, cheese, lettuce, tomato, sauce);
	}
	
}

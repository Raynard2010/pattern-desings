package model;

public class Burger {

	// define atribut burger
	// pakai final agar immutable (tidak bisa diubah lagi setelah dibuat)
	private final String bun;
	private final String patty;
	private final boolean cheese;
	private final boolean lettuce;
	private final boolean tomato;
	private final boolean sauce;
	
	public Burger(String bun, String patty, boolean cheese, boolean lettuce, boolean tomato, boolean sauce) {
		super();
		this.bun = bun;
		this.patty = patty;
		this.cheese = cheese;
		this.lettuce = lettuce;
		this.tomato = tomato;
		this.sauce = sauce;
	}
	
	// method to display final product/burger
	public String toString() {
		return "Burger{" + "bun = " + bun + ", patty = " + patty + ", cheese = "+ cheese + ", lettuce = " + lettuce + ", tomato = "  + tomato + ", sauce = " + sauce + "}";
	}
	
}

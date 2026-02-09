package directors;

import builders.BurgerBuilder;
import model.Burger;

public class BurgerDirector {
	// director = define standard recipe
	// 1. standard burger
	// 2. simple burger
	
	public Burger makeStandarBurger(BurgerBuilder builder) {
		return builder.reset()
				.setBun("Sesame")
				.setPatty("Beef")
				.setCheese(true)
				.setLettuce(true)
				.setTomato(true)
				.setSauce(true)
				.getResult();
	}
	
	public Burger makeSimpleBurger(BurgerBuilder builder) {
		return builder.reset()
				.setBun("Plain")
				.setPatty("Chicken")
				.setCheese(true)
				.setLettuce(true)
				.getResult();
	}
}

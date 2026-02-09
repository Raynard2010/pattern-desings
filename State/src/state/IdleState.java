package state;

import model.Chef;

public class IdleState extends State {

	public IdleState(Chef chef) {
		super(chef);
		// TODO Auto-generated constructor stub
		System.out.println("Chef " + chef.getName() + " is idle.");
		handle();
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		chef.setState(new CookState(chef));
	}

}

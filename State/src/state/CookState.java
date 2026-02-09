package state;

import model.Chef;

public class CookState extends State{

	public CookState(Chef chef) {
		super(chef);
		// TODO Auto-generated constructor stub
		handle();
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Chef " + chef.getName() + " is cooking.");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		chef.setState(new DeliverState(chef));
	}

}

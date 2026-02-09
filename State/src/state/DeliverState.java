package state;

import model.Chef;

public class DeliverState extends State {

	public DeliverState(Chef chef) {
		super(chef);
		// TODO Auto-generated constructor stub
		handle();
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Chef " + chef.getName() + " is delivering order.");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// pindah ke state idle
		chef.setState(new IdleState(chef));
	}

}

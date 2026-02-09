package model;

public class Chef extends Worker{
	private int orders;
	
	public Chef(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void work() {
		// TODO Auto-generated method stub
		orders = rand.nextInt(11);
		System.out.println("Cooking orders...");
	}

	@Override
	protected void showEarning() {
		// TODO Auto-generated method stub
		int earning = 40000 * orders;
		System.out.println("Today's earning: " + earning);
	}

}

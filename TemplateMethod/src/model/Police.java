package model;

public class Police extends Worker{
	private int thieves;

	public Police(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void work() {
		// TODO Auto-generated method stub
		thieves = rand.nextInt(6);
		System.out.println("Catching thieves...");
	}

	@Override
	protected void showEarning() {
		// TODO Auto-generated method stub
		int earning = 50000 * thieves;
		System.out.println("Today's earning: " + earning);
	}

}

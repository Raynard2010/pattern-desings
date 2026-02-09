package model;

public class FireFighter extends Worker{
	private int extinguishedFire;

	public FireFighter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void work() {
		// TODO Auto-generated method stub
		extinguishedFire = rand.nextInt(11);
		System.out.println("Extinguishing fire...");
	}

	@Override
	protected void showEarning() {
		// TODO Auto-generated method stub
		int earning = 75000 * extinguishedFire;
		System.out.println("Today's earning: " + earning);
	}

}

package model;

import java.util.Random;

public abstract class Worker {
	protected String name;
	
	Random rand = new Random();
	
	public Worker(String name) {
		super();
		this.name = name;
	}

	// step
	protected void getUp() {
		System.out.println("Waking up...");
	}
	
	protected void getToWork() {
		System.out.println("Going to work...");
	}
	
	protected abstract void work();
	
	protected void sleep() {
		System.out.println("Zzz...");
	}
	
	protected abstract void showEarning();
	
	// template method
	public void doDailyRoutine() {
		getUp();
		getToWork();
		work();
		sleep();
		showEarning();
	}
}

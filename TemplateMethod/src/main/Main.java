package main;

import model.Chef;
import model.FireFighter;
import model.Police;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		FireFighter f = new FireFighter("Budi");
		f.doDailyRoutine();
		
		Police p = new Police("Ahmad");
		p.doDailyRoutine();
		
		Chef c = new Chef("Charlie");
		c.doDailyRoutine();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

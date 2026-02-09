package main;

import adapter.SquareToRoundAdapter;
import model.RoundHole;
import model.RoundPeg;
import model.SquarePeg;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		RoundHole hole = new RoundHole(10);
		RoundPeg peg = new RoundPeg(10);
		
		hole.isFit(peg);
		
		SquarePeg peg2 = new SquarePeg(5);
		
//		hole.isFit(peg2);
		
		SquareToRoundAdapter adapter = new SquareToRoundAdapter(peg2);
		
		hole.isFit(adapter);
		
		SquareToRoundAdapter adapter2 = new SquareToRoundAdapter(new SquarePeg(10));
		
		hole.isFit(adapter2);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

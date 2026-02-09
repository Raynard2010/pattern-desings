package adapter;

import model.RoundPeg;
import model.SquarePeg;

public class SquareToRoundAdapter extends RoundPeg{

	public SquareToRoundAdapter(SquarePeg peg) {
		// aslinya super isinya diameter
		// kita cari diagonal dari width
		// width * akar 2
		super(peg.getWidth() * Math.sqrt(2));
	}

}

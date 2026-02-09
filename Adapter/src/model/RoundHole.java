package model;

public class RoundHole {
	private double diameter;

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public RoundHole(double diameter) {
		super();
		this.diameter = diameter;
	}
	
	public void isFit(RoundPeg peg) {
		if(peg.getDiameter() <= this.diameter) {
			System.out.println("Peg fit!");
		}
		else {
			System.out.println("Peg doesn't fit");
		}
	}
}

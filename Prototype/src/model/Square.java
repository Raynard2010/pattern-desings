package model;

public class Square extends Shape {
	
	private int size;

	// constructor utama
	public Square(String color, int size) {
		super(color);
		this.size = size;
	}
		
	// copy constructor
	public Square(Square square) {
		super(square);
		this.size = square.size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public Shape clone() {
		// TODO Auto-generated method stub
		return new Square(this);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square warna: " + color + " dengan size " + size);
	}

}

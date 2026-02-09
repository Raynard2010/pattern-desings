package model;

public class Circle extends Shape {

	private int radius;

	// constructor utama
	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}
	
	// copy constructor
	public Circle(Circle circle) {
		super(circle);
		this.radius = circle.radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public Shape clone() {
		// TODO Auto-generated method stub
		return new Circle(this);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Lingkaran warna: " + color + " dengan radius " + radius);
	}
	
}

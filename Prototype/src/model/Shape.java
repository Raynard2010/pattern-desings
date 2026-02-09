package model;

public abstract class Shape {

	protected String color;

	// constructor utama
	public Shape(String color) {
		super();
		this.color = color;
	}
	
	
	// constructor untuk prototype
	// nyalin state ke object baru
	public Shape(Shape shape) {
		this.color = shape.color;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	// method prototype
	public abstract Shape clone();
	
	// buat print detail
	public abstract void draw();
	

}

package main;

import model.Circle;
import model.Square;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Circle c1 = new Circle("Merah", 18);
		Square s1 = new Square("Biru", 5);
		
		// assign biasa -> cuma copy reference (cara gk bener)
		
		Circle c2 = c1;
		c1.setColor("Hijau");
		
		c2.draw(); // ikut berubah karena satu objek
		
		// clone -> object baru
		Circle c3 = (Circle) c1.clone();
		c1.setColor("Kuning");
		
		c1.draw();
		c3.draw();
		
		// clone square
		Square s2 = (Square) s1.clone();
		s1.setSize(10);
		
		s1.draw();
		s2.draw();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

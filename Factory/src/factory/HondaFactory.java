package factory;

import model.Car;
import model.HondaCar;

public class HondaFactory extends CarFactory {
	
	public Car createCar() {
		return new HondaCar();
	}
}

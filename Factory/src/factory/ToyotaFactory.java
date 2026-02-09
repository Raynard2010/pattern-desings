package factory;

import model.Car;
import model.ToyotaCar;

public class ToyotaFactory extends CarFactory{
	public Car createCar() {
		return new ToyotaCar();
	}
}

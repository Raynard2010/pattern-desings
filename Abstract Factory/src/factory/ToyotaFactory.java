package factory;

import model.car.Car;
import model.car.ToyotaCar;
import model.motorcycle.Motorcycle;
import model.motorcycle.ToyotaMotorcycle;

public class ToyotaFactory extends VehicleFactory{

	public ToyotaFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new ToyotaCar();
	}

	@Override
	public Motorcycle createMotorcycle() {
		// TODO Auto-generated method stub
		return new ToyotaMotorcycle();
	}

}

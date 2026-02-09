package factory;

import model.car.Car;
import model.motorcycle.Motorcycle;

public abstract class VehicleFactory {

	public VehicleFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract Car createCar();
	public abstract Motorcycle createMotorcycle();
}

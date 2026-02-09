package factory;

import model.car.Car;
import model.car.HondaCar;
import model.motorcycle.HondaMotorcycle;
import model.motorcycle.Motorcycle;

public class HondaFactory extends VehicleFactory{

	public HondaFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new HondaCar();
	}

	@Override
	public Motorcycle createMotorcycle() {
		// TODO Auto-generated method stub
		return new HondaMotorcycle();
	}
	
	

}

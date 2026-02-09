package main;

import java.util.Scanner;

import factory.HondaFactory;
import factory.ToyotaFactory;
import factory.VehicleFactory;
import model.car.Car;
import model.motorcycle.Motorcycle;

public class Main {
	Scanner sc = new Scanner(System.in);

	public Main() {
		// TODO Auto-generated constructor stub
		String brand, vehicle;
		VehicleFactory factory = null;
		
		System.out.println("Input vehicle brand: ");
		brand = sc.nextLine();
			
		System.out.println("Input vehicle type: ");
		vehicle = sc.nextLine();
		
		if(brand.equals("Honda")) {
			factory = new HondaFactory();
		}
		else if(brand.equals("Toyota")) {
			factory = new ToyotaFactory();
		}
		
		if(vehicle.equals("Car")) {
			Car car = factory.createCar();
			System.out.println(car);
		}
		else if(vehicle.equals("Motor")){
			Motorcycle motor = factory.createMotorcycle();
			System.out.println(motor);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

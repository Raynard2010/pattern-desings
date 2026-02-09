package main;

import java.util.Scanner;

import factory.CarFactory;
import factory.HondaFactory;
import factory.ToyotaFactory;
import model.Car;
import model.HondaCar;
import model.ToyotaCar;

public class Main {

	Scanner sc = new Scanner(System.in);
	
	public Main() {
		// TODO Auto-generated constructor stub
		String brand;
		Car car;
		CarFactory carFactory;
		
		System.out.println("What car brand do you want?");
		brand = sc.nextLine();
		
		if(brand.equals("Honda")) {
//			car = new HondaCar();
			carFactory = new HondaFactory();
		}
		else if(brand.equals("Toyota")) {
//			car = new ToyotaCar();
			carFactory = new ToyotaFactory();
		}
		else {
			// default biar gk kosong
//			car = new HondaCar();
			carFactory = new HondaFactory();
		}
		
		car = carFactory.createCar();
		
		System.out.println(car);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

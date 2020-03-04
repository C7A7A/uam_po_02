package car_rental;

import car_rental.Car;
import car_rental.PetrolEngine;

public class CarRentalApp {

	public static void main(String[] args) {
		Car car = new Car("Honda", "XDXD12", "123123123123", "blue", 20000, 7, 50, 1000, new PetrolEngine(), 4);
		car.refuel(50);
        car.drive(100);
	}

}

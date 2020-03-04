package car_rental;

public class Motorcycle extends Vehicle {

	public Motorcycle() {
		
	}
	
	public Motorcycle(String model, String reg_number, String vin, String color, double price, double burning,
			double fuel_condition, double km_traveled, Engine engine) {
		super(model, reg_number, vin, color, price, burning, fuel_condition, km_traveled, engine);
	}

}

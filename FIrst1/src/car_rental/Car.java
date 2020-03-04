package car_rental;

public class Car extends Vehicle {

	private int doors;
	
	public Car(String model, String reg_number, String vin, String color, double price, double burning,
			double fuel_condition, double km_traveled, Engine engine, int doors) {
		super(model, reg_number, vin, color, price, burning, fuel_condition, km_traveled, engine);
		this.doors = doors;
	}
	
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
}

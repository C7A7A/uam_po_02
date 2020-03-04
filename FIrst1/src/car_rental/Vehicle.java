package car_rental;

public class Vehicle {
	
	private String model;
	private String reg_number;
	private String vin;
	private String color;
	private double price;
	private double burning;
	private double fuel_condition;
	private double km_traveled;
	private Engine engine;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String model, String reg_number, String vin, String color, double price, 
			   double burning, double fuel_condition, double km_traveled, Engine engine) {
		this.model = model;
		this.reg_number = reg_number;
		this.vin = vin;
		this.color = color;
		this.price = price;
		this.burning = burning;
		this.fuel_condition = fuel_condition;
		this.km_traveled = km_traveled;
		this.engine = engine;
	}
	
	public void drive(double km_traveled) {
		this.km_traveled += km_traveled;
		fuel_condition -= burning * km_traveled;
		System.out.println("Przejecha³eœ " + km_traveled + " km");
	}
	
	public void refuel(double fuel_condition) {
		fuel_condition += fuel_condition;
		System.out.println("Masz w baku " + fuel_condition + "l paliwa");
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setReg_number(String reg_number) {
		this.reg_number = reg_number;
	}
	
	public void setVin(String vin) {
		this.vin = vin;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setBurning(double burning) {
		this.burning = burning;
	}
	
	public void setFuel_condition(double fuel_condition) {
		this.fuel_condition = fuel_condition;
	}
	
	public void setKm_traveled(double km_traveled) {
		this.km_traveled = km_traveled;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}

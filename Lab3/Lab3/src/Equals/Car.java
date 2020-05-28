package Equals;

public class Car {

	int year;

	public Car(int produceYear) {
		year = produceYear;
	}

	public boolean equals(Object aThat) {
		// check for self-comparison
		if (this == aThat)
			return true;

		// use instanceof instead of getClass here for two reasons
		// 1. if need be, it can match any supertype, and not just one class;
		// 2. it renders an explict check for "that == null" redundant, since
		// it does the check for null already - "null instanceof [type]" always
		// returns false. (See Effective Java by Joshua Bloch.)
		if (!(aThat instanceof Car))
			return false;
		// Alternative to the above line :
		// if ( aThat == null || aThat.getClass() != this.getClass() ) return
		// false;

		// cast to native object is now safe
		Car other = (Car) aThat;

		// now a proper field-by-field evaluation can be made
		return this.year == other.year;
	}

}

class BigCar extends Car {
	int weight;

	public BigCar(int weight, int year) {
		super(year);
		this.weight = weight;
	}

	public boolean equals(Object aThat) {
		if (this == aThat) {
			return true;
		}
		if (!super.equals(aThat)) {
			return false;
		}
		if(!(aThat instanceof BigCar)) {
			return false;
		}
		BigCar other = (BigCar) aThat;
		if (other.weight != weight) {
			return false;
		}
		return true;
	}
}

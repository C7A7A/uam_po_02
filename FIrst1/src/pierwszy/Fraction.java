package pierwszy;

public class Fraction {
	
	private int fractionInteger;
	private int numerator;
	private int denominator;
	
	public Fraction(int fractionInteger, int numerator, int denominator) {
		this.fractionInteger = fractionInteger;
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction(int numerator, int denominator) {
		if (numerator == denominator) {
			this.fractionInteger = 1;
			this.numerator = 0;
			this.denominator = 1;
		} else if (numerator > denominator) {
			this.fractionInteger = numerator / denominator;
			this.numerator = numerator % denominator;
			this.denominator = denominator;
		} else {
			this.fractionInteger = 0;
			this.numerator = numerator;
			this.denominator = denominator;
		}
	}
	
	public double getFractionAsDecimal() {
		return fractionInteger + (double) numerator / denominator;
	} 
	
	public Fraction add(Fraction fraction) {
		int n1 = this.numerator + this.fractionInteger * this.denominator;
		int d1 = this.denominator;
		int n2 = fraction.numerator + fraction.fractionInteger * fraction.denominator;
		int d2 = fraction.denominator;
		return new Fraction(n1 * d2 + n2 * d1, d1 * d2);
	}
	
	public Fraction substract(Fraction fraction) {
		int n1 = this.numerator + this.fractionInteger * this.denominator;
		int d1 = this.denominator;
		int n2 = fraction.numerator + fraction.fractionInteger * fraction.denominator;
		int d2 = fraction.denominator;
		return new Fraction(n1 * d2 - n2, d1 * d2);
	}
	
	public Fraction multiply(Fraction fraction) {
		int n1 = this.numerator + this.fractionInteger * this.denominator;
		int d1 = this.denominator;
		int n2 = fraction.numerator + fraction.fractionInteger * fraction.denominator;
		int d2 = fraction.denominator;
		return new Fraction(n1 * n2, d1 * d2);
	}
	
	public Fraction divide(Fraction fraction) {
		int n1 = this.numerator + this.fractionInteger * this.denominator;
		int d1 = this.denominator;
		int n2 = fraction.numerator + fraction.fractionInteger * fraction.denominator;
		int d2 = fraction.denominator;
		return new Fraction(n1 / n2, d1 / d2);
	}
}

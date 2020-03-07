package pierwszy;

public class Fraction {
	
	public int fractionInteger;
	public int numerator;
	public int denominator;
	
	public Fraction() { 
		
	}
	
	public Fraction(int fractionInteger, int numerator, int denominator) {
		this.fractionInteger = fractionInteger;
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction(int numerator, int denominator) {
		if (numerator == denominator) {
			this.fractionInteger = 1;
			this.numerator = 0;
			this.denominator = 0;
		} else if(numerator < denominator) {
			this.fractionInteger = 0;
			this.numerator = numerator;
			this.denominator = denominator;
		} else if(numerator > denominator) {
			this.fractionInteger = numerator / denominator;
			this.numerator = numerator % denominator;
			
			if(numerator % denominator == 0) {
				this.denominator = 0;
			} else {
				this.denominator = denominator;
			}
		}
	}
	
	public Fraction multiply(Fraction fraction) {
		int num1 = this.numerator;
		int den1 = this.denominator;
		int fraInt1 = this.fractionInteger;
		
		int num2 = fraction.numerator;
		int den2 = fraction.denominator;
		int fraInt2 = fraction.fractionInteger;
		
		num1 = fraInt1 * den1 + num1;
		num2 = fraInt2 * den2 + num2;
		
		Fraction result = new Fraction(num1 * num2, den1 * den2);
		return result;
	}
	
	public Fraction divide(Fraction fraction) {
		int num1 = this.numerator;
		int den1 = this.denominator;
		int fraInt1 = this.fractionInteger;
		
		int num2 = fraction.numerator;
		int den2 = fraction.denominator;
		int fraInt2 = fraction.fractionInteger;
		
		num1 = fraInt1 * den1 + num1;
		num2 = fraInt2 * den2 + num2;
		
		Fraction result = new Fraction(num1 * den2, num2 * den1);
		return result;
	}
	
	public Fraction add(Fraction fraction) {
		int tmp;
		
		int num1 = this.numerator;
		int den1 = this.denominator;
		int fraInt1 = this.fractionInteger;
		
		int num2 = fraction.numerator;
		int den2 = fraction.denominator;
		int fraInt2 = fraction.fractionInteger;
		
		num1 = fraInt1 * den1 + num1;
		num2 = fraInt2 * den2 + num2;
		
		num1 = num1 * den2;
		num2 = num2 * den1;
		tmp = den1;
		den1 = den1 * den2;
		den2 = den2 * tmp;
		
		Fraction result = new Fraction(num1 + num2, den1);
		return result;
	}
	
	public Fraction substract(Fraction fraction) {
		int tmp;
		
		int num1 = this.numerator;
		int den1 = this.denominator;
		int fraInt1 = this.fractionInteger;
		
		int num2 = fraction.numerator;
		int den2 = fraction.denominator;
		int fraInt2 = fraction.fractionInteger;
		
		num1 = fraInt1 * den1 + num1;
		num2 = fraInt2 * den2 + num2;
		
		num1 = num1 * den2;
		num2 = num2 * den1;
		tmp = den1;
		den1 = den1 * den2;
		den2 = den2 * tmp;
		
		Fraction result = new Fraction(num1 - num2, den1);
		return result;
	}
	
}
